package com.woniuxy.examserver.mapper;

import com.woniuxy.examserver.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author admin
* @description 针对表【question(题目表)】的数据库操作Mapper
* @createDate 2026-07-23 16:05:11
* @Entity com.woniuxy.examserver.entity.Question
*/
@Mapper
public interface QuestionMapper extends BaseMapper<Question> {

}




