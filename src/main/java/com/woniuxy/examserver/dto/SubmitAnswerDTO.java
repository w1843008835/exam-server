package com.woniuxy.examserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class SubmitAnswerDTO {
    /** 用户 ID */
    private Long userId;
    private Long questionId;
    private String selectOptions;
    private String examType;
    private Boolean  isCorrect;
}
