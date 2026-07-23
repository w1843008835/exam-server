package com.woniuxy.examserver.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
@Builder
@Data
public class QuestionDto {
    /** id */
    private String id;
    /** 题号*/
    private String sort;
    /** 题干内容 */
    private String title;
    /** 题目类型（单选题，多选题） */
    private String questionType;
    /** 选项 */
    HashMap<String,String> options;
    /** 正确答案 */
    private List<String> correctAnswer;
    /** 答案解析 */
    private String analysis;
    /** 用户选择 */
    private List<String> select_options;
    /** 是否正确（0错1对） */
    private Integer is_correct;
}
