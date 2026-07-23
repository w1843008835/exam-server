package com.woniuxy.examserver.controller;

import com.woniuxy.examserver.dto.R;
import com.woniuxy.examserver.service.QuestionService;
import com.woniuxy.examserver.service.impl.QuestionServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/exam")
public class ExamController {
    private final QuestionService questionService;

    @GetMapping("exams")
    public R exams(){
        return new R(questionService.getExams());
    }

    @GetMapping("questions/{examType}")
    public R questions(@PathVariable("examType") String examType){
        return new R(questionService.getQuestions(examType));
    }


}
