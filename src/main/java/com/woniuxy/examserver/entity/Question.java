package com.woniuxy.examserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 题目表
 * @TableName question
 */
@TableName(value ="question")
public class Question {
    /**
     * 题目ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 题号
     */
    private Long sort;

    /**
     * 题干内容
     */
    private String title;

    /**
     * 题目类型：单选 ,多选
     */
    private String questionType;

    /**
     * 正确的选项，逗号分隔 例:A,C
     */
    private String correctOptions;

    /**
     * 答案解析
     */
    private String analysis;

    /**
     * 题库类型
     */
    private String examType;

    /**
     * 题目ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 题目ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 题号
     */
    public Long getSort() {
        return sort;
    }

    /**
     * 题号
     */
    public void setSort(Long sort) {
        this.sort = sort;
    }

    /**
     * 题干内容
     */
    public String getTitle() {
        return title;
    }

    /**
     * 题干内容
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 题目类型：单选 ,多选
     */
    public String getQuestionType() {
        return questionType;
    }

    /**
     * 题目类型：单选 ,多选
     */
    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    /**
     * 正确的选项，逗号分隔 例:A,C
     */
    public String getCorrectOptions() {
        return correctOptions;
    }

    /**
     * 正确的选项，逗号分隔 例:A,C
     */
    public void setCorrectOptions(String correctOptions) {
        this.correctOptions = correctOptions;
    }

    /**
     * 答案解析
     */
    public String getAnalysis() {
        return analysis;
    }

    /**
     * 答案解析
     */
    public void setAnalysis(String analysis) {
        this.analysis = analysis;
    }

    /**
     * 题库类型
     */
    public String getExamType() {
        return examType;
    }

    /**
     * 题库类型
     */
    public void setExamType(String examType) {
        this.examType = examType;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Question other = (Question) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getQuestionType() == null ? other.getQuestionType() == null : this.getQuestionType().equals(other.getQuestionType()))
            && (this.getCorrectOptions() == null ? other.getCorrectOptions() == null : this.getCorrectOptions().equals(other.getCorrectOptions()))
            && (this.getAnalysis() == null ? other.getAnalysis() == null : this.getAnalysis().equals(other.getAnalysis()))
            && (this.getExamType() == null ? other.getExamType() == null : this.getExamType().equals(other.getExamType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getQuestionType() == null) ? 0 : getQuestionType().hashCode());
        result = prime * result + ((getCorrectOptions() == null) ? 0 : getCorrectOptions().hashCode());
        result = prime * result + ((getAnalysis() == null) ? 0 : getAnalysis().hashCode());
        result = prime * result + ((getExamType() == null) ? 0 : getExamType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", sort=").append(sort);
        sb.append(", title=").append(title);
        sb.append(", questionType=").append(questionType);
        sb.append(", correctOptions=").append(correctOptions);
        sb.append(", analysis=").append(analysis);
        sb.append(", examType=").append(examType);
        sb.append("]");
        return sb.toString();
    }
}