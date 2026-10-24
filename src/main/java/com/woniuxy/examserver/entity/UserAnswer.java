package com.woniuxy.examserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;

/**
 * 用户答题记录表
 * @TableName user_answer
 */
@Builder
@TableName(value ="user_answer")
public class UserAnswer {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 题目ID
     */
    private Long questionId;

    /**
     * 用户选择的选项，逗号分隔 例:A,C
     */
    private String selectOptions;

    /**
     * 是否答对 0错1对
     */
    private Integer isCorrect;

    /**
     * 题库类型
     */
    private String examType;

    /**
     * 
     */
    public Long getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 用户ID
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 题目ID
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * 题目ID
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * 用户选择的选项，逗号分隔 例:A,C
     */
    public String getSelectOptions() {
        return selectOptions;
    }

    /**
     * 用户选择的选项，逗号分隔 例:A,C
     */
    public void setSelectOptions(String selectOptions) {
        this.selectOptions = selectOptions;
    }

    /**
     * 是否答对 0错1对
     */
    public Integer getIsCorrect() {
        return isCorrect;
    }

    /**
     * 是否答对 0错1对
     */
    public void setIsCorrect(Integer isCorrect) {
        this.isCorrect = isCorrect;
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
        UserAnswer other = (UserAnswer) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getQuestionId() == null ? other.getQuestionId() == null : this.getQuestionId().equals(other.getQuestionId()))
            && (this.getSelectOptions() == null ? other.getSelectOptions() == null : this.getSelectOptions().equals(other.getSelectOptions()))
            && (this.getIsCorrect() == null ? other.getIsCorrect() == null : this.getIsCorrect().equals(other.getIsCorrect()))
            && (this.getExamType() == null ? other.getExamType() == null : this.getExamType().equals(other.getExamType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        result = prime * result + ((getSelectOptions() == null) ? 0 : getSelectOptions().hashCode());
        result = prime * result + ((getIsCorrect() == null) ? 0 : getIsCorrect().hashCode());
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
        sb.append(", userId=").append(userId);
        sb.append(", questionId=").append(questionId);
        sb.append(", selectOptions=").append(selectOptions);
        sb.append(", isCorrect=").append(isCorrect);
        sb.append(", examType=").append(examType);
        sb.append("]");
        return sb.toString();
    }
}