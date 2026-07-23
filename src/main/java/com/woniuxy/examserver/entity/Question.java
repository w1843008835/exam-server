package com.woniuxy.examserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
     * 题干内容
     */
    private String title;

    /**
     * 题目类型：1单选 2多选
     */
    private Integer questionType;

    /**
     * 难度：1简单 2中等 3困难
     */
    private Integer difficulty;

    /**
     * 答案解析
     */
    private String analysis;

    /**
     * 题库
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
     * 题目类型：1单选 2多选
     */
    public Integer getQuestionType() {
        return questionType;
    }

    /**
     * 题目类型：1单选 2多选
     */
    public void setQuestionType(Integer questionType) {
        this.questionType = questionType;
    }

    /**
     * 难度：1简单 2中等 3困难
     */
    public Integer getDifficulty() {
        return difficulty;
    }

    /**
     * 难度：1简单 2中等 3困难
     */
    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
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
     * 题库
     */
    public String getExamType() {
        return examType;
    }

    /**
     * 题库
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
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getQuestionType() == null ? other.getQuestionType() == null : this.getQuestionType().equals(other.getQuestionType()))
            && (this.getDifficulty() == null ? other.getDifficulty() == null : this.getDifficulty().equals(other.getDifficulty()))
            && (this.getAnalysis() == null ? other.getAnalysis() == null : this.getAnalysis().equals(other.getAnalysis()))
            && (this.getExamType() == null ? other.getExamType() == null : this.getExamType().equals(other.getExamType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getQuestionType() == null) ? 0 : getQuestionType().hashCode());
        result = prime * result + ((getDifficulty() == null) ? 0 : getDifficulty().hashCode());
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
        sb.append(", title=").append(title);
        sb.append(", questionType=").append(questionType);
        sb.append(", difficulty=").append(difficulty);
        sb.append(", analysis=").append(analysis);
        sb.append(", examType=").append(examType);
        sb.append("]");
        return sb.toString();
    }
}