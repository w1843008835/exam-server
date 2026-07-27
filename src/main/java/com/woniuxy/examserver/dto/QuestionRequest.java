package com.woniuxy.examserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class QuestionRequest {
    private Integer questionNumber;
    private String examType;
    private String userAnswer;
    private Long userId;
}
