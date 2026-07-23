package com.woniuxy.examserver.mapper;

import com.woniuxy.examserver.entity.UserAnswer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author admin
* @description 针对表【user_answer(用户答题记录)】的数据库操作Mapper
* @createDate 2026-07-23 16:05:11
* @Entity com.woniuxy.examserver.entity.UserAnswer
*/
@Mapper
public interface UserAnswerMapper extends BaseMapper<UserAnswer> {

}




