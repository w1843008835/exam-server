package com.woniuxy.examserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class QuestionDto {
    /** id */
    private Long questionId;
    /** 题号*/
    private Long sort;
    /** 题干内容 */
    private String title;
    /** 题目类型（单选题，多选题） */
    private String questionType;
    /** 选项 */
    private List<ChoiceDto> options;
    /** 正确答案 */
    private String correctAnswer;
    /** 答案解析 */
    private String analysis;
    /** 用户选择 */
    private String userAnswer;
}
