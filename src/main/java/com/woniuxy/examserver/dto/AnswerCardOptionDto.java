package com.woniuxy.examserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AnswerCardOptionDto {
    private Long questionId;
    private Integer questionNumber;
    private String isCorrect;
}
