package com.woniuxy.examserver.service.impl;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxy.examserver.dto.*;
import com.woniuxy.examserver.entity.Question;
import com.woniuxy.examserver.entity.QuestionOption;
import com.woniuxy.examserver.entity.UserAnswer;
import com.woniuxy.examserver.service.QuestionOptionService;
import com.woniuxy.examserver.service.QuestionService;
import com.woniuxy.examserver.mapper.QuestionMapper;
import com.woniuxy.examserver.service.UserAnswerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

import static com.woniuxy.examserver.constant.Const.*;

/**
* @author admin
* @description 针对表【question(题目表)】的数据库操作Service实现
* @createDate 2026-07-23 16:05:11
*/
@Service
@Slf4j
@RequiredArgsConstructor
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

    private final QuestionOptionService questionOptionService;
    private final UserAnswerService userAnswerService;
    private final QuestionMapper questionMapper;


    @Override
    public QuestionDto getQuestion(QuestionRequest questionRequest) {
        Integer questionNum = questionRequest.getQuestionNumber();
        String examType = questionRequest.getExamType();
        String answer = questionRequest.getUserAnswer();

        Question question = getOne(Wrappers.lambdaQuery(Question.class)
                .eq(Question::getExamType, examType)
                .eq(Question::getSort, questionNum));
        UserAnswer userAnswerObj = userAnswerService.getOne(Wrappers.lambdaQuery(UserAnswer.class)
                .eq(UserAnswer::getExamType, examType)
                .eq(UserAnswer::getQuestionId, questionNum));
        if(answer != null && userAnswerObj==null){
            UserAnswer userAnswer= UserAnswer.builder()
                            .userId(questionRequest.getUserId())
                    .questionId(Long.valueOf(questionNum))
                    .selectOptions(answer)
                    .examType(examType)
                    .isCorrect(answer.equals(question.getCorrectOptions())?1:0)
                    .build();
            userAnswerService.save(userAnswer);
        }


        List<QuestionOption> questionOptions = questionOptionService.list(
                Wrappers.lambdaQuery(QuestionOption.class)
                        .eq(QuestionOption::getExamType, examType)
                        .eq(QuestionOption::getQuestionId, questionNum));
        userAnswerObj = userAnswerService.getOne(Wrappers.lambdaQuery(UserAnswer.class)
                .eq(UserAnswer::getExamType, examType)
                .eq(UserAnswer::getQuestionId, questionNum));

        List<ChoiceDto> options = questionOptions.stream()
                .map(item -> {
                    ChoiceDto choice = ChoiceDto.builder()
                            .label(item.getOptionCode())
                            .value(item.getOptionContent())
                            .build();
                    return choice;
                })
                .collect(Collectors.toList());

        QuestionDto dto = QuestionDto.builder()
                .questionId(question.getId())
                .sort(question.getSort())
                .title(question.getTitle())
                .questionType(question.getQuestionType())
                .options(options)
                .correctAnswer(question.getCorrectOptions())
                .analysis(question.getAnalysis())
                .userAnswer(userAnswerObj==null?null:userAnswerObj.getSelectOptions())
                .build();
        return dto;
    }

    @Override
    public AnswerCardDto getAnswerCard(String examType) {

         Integer correctCount = 0;
         Integer incorrectCount = 0;
         Integer undoCount = 0;
         List<AnswerCardOptionDto> options = new ArrayList<>();
        List<QuestionUserAnswerDto> questionUserAnswerDtos = questionMapper.selectQuestionByExamType(examType);
                for(QuestionUserAnswerDto q:questionUserAnswerDtos){
                    String isCorrect= ANSWER_STATUS_UNDO;
                    if(q.getIsCorrect() == null){
                        undoCount++;
                    }else if(q.getIsCorrect() == 1){
                        correctCount++;
                        isCorrect = ANSWER_STATUS_CORRECT;
                    }else{
                        incorrectCount++;
                        isCorrect = ANSWER_STATUS_WRONG;
                    }

                    AnswerCardOptionDto dto = AnswerCardOptionDto.builder()
                            .questionId(q.getId())
                            .questionNumber(q.getSort())
                            .isCorrect(isCorrect)
                            .build();
                    options.add(dto);
                }
        AnswerCardDto answerCardDto = AnswerCardDto.builder()
                .correct(correctCount)
                .incorrect(incorrectCount)
                .undo(undoCount)
                .options(options)
                .build();
        return answerCardDto;
    }

    @Override
    public String reset(ResetDto resetDto) {
        LambdaUpdateWrapper<UserAnswer> wrapper = Wrappers.lambdaUpdate();
        wrapper.eq(UserAnswer::getUserId, resetDto.getUserId())
                .eq(UserAnswer::getExamType, resetDto.getExamType());
        userAnswerService.remove(wrapper);
        return "";
    }
}




