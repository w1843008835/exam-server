package com.woniuxy.examserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 题目选项表
 * @TableName question_option
 */
@TableName(value ="question_option")
public class QuestionOption {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 关联题目ID
     */
    private Long questionId;

    /**
     * 选项编码 A/B/C/D/E
     */
    private String optionCode;

    /**
     * 选项内容
     */
    private String optionContent;

    /**
     * 是否正确答案：0否 1是
     */
    private Integer isAnswer;

    /**
     * 选项展示顺序
     */
    private Integer sort;

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
     * 关联题目ID
     */
    public Long getQuestionId() {
        return questionId;
    }

    /**
     * 关联题目ID
     */
    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    /**
     * 选项编码 A/B/C/D/E
     */
    public String getOptionCode() {
        return optionCode;
    }

    /**
     * 选项编码 A/B/C/D/E
     */
    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }

    /**
     * 选项内容
     */
    public String getOptionContent() {
        return optionContent;
    }

    /**
     * 选项内容
     */
    public void setOptionContent(String optionContent) {
        this.optionContent = optionContent;
    }

    /**
     * 是否正确答案：0否 1是
     */
    public Integer getIsAnswer() {
        return isAnswer;
    }

    /**
     * 是否正确答案：0否 1是
     */
    public void setIsAnswer(Integer isAnswer) {
        this.isAnswer = isAnswer;
    }

    /**
     * 选项展示顺序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 选项展示顺序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
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
        QuestionOption other = (QuestionOption) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getQuestionId() == null ? other.getQuestionId() == null : this.getQuestionId().equals(other.getQuestionId()))
            && (this.getOptionCode() == null ? other.getOptionCode() == null : this.getOptionCode().equals(other.getOptionCode()))
            && (this.getOptionContent() == null ? other.getOptionContent() == null : this.getOptionContent().equals(other.getOptionContent()))
            && (this.getIsAnswer() == null ? other.getIsAnswer() == null : this.getIsAnswer().equals(other.getIsAnswer()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        result = prime * result + ((getOptionCode() == null) ? 0 : getOptionCode().hashCode());
        result = prime * result + ((getOptionContent() == null) ? 0 : getOptionContent().hashCode());
        result = prime * result + ((getIsAnswer() == null) ? 0 : getIsAnswer().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", questionId=").append(questionId);
        sb.append(", optionCode=").append(optionCode);
        sb.append(", optionContent=").append(optionContent);
        sb.append(", isAnswer=").append(isAnswer);
        sb.append(", sort=").append(sort);
        sb.append("]");
        return sb.toString();
    }
}