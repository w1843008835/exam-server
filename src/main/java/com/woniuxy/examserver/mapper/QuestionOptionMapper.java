package com.woniuxy.examserver.mapper;

import com.woniuxy.examserver.entity.QuestionOption;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author admin
* @description 针对表【question_option(题目选项表)】的数据库操作Mapper
* @createDate 2026-07-24 13:55:58
* @Entity com.woniuxy.examserver.entity.QuestionOption
*/
@Mapper
public interface QuestionOptionMapper extends BaseMapper<QuestionOption> {

}




