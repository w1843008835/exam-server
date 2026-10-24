package com.woniuxy.examserver.service;

import com.woniuxy.examserver.dto.*;
import com.woniuxy.examserver.entity.Question;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author admin
* @description 针对表【question(题目表)】的数据库操作Service
* @createDate 2026-07-23 16:05:11
*/
public interface QuestionService extends IService<Question> {

    QuestionDto getQuestion(QuestionRequest questionRequest);

    AnswerCardDto getAnswerCard(String examType);

    String reset(ResetDto resetDto);
}
