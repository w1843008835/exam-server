package com.woniuxy.examserver.controller;

import com.woniuxy.examserver.dto.QuestionRequest;
import com.woniuxy.examserver.dto.R;
import com.woniuxy.examserver.entity.Question;
import com.woniuxy.examserver.service.QuestionService;
import com.woniuxy.examserver.service.TikuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/exam")
public class ExamController {
    private final QuestionService questionService;
    private final TikuService tikuService;

    @GetMapping("tiku")
    public R exams(){
        return new R(tikuService.getTikus());
    }

    @PostMapping("/question")
    public R question(@RequestBody QuestionRequest questionRequest){
        return new R(questionService.getQuestion(questionRequest));
    }

    @GetMapping("answerCard/{examType}")
    public R answerCard(@PathVariable("examType") String examType){
        return new R(questionService.getAnswerCard(examType));
    }




}
