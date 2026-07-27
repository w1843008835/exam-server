package com.woniuxy.examserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class ExamDto {
    /** id */
    private Long id;
    /** 标题 */
    private String title;
    /** 描述 */
    private String description;
    /** 题目数量 */
    private Integer questionCount;
    /** 题库类型 */
    private String examType;

}
