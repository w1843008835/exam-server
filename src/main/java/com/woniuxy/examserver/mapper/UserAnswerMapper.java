package com.woniuxy.examserver.mapper;

import com.woniuxy.examserver.entity.UserAnswer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author admin
* @description 针对表【user_answer(用户答题记录表)】的数据库操作Mapper
* @createDate 2026-07-24 16:41:03
* @Entity com.woniuxy.examserver.entity.UserAnswer
*/
@Mapper
public interface UserAnswerMapper extends BaseMapper<UserAnswer> {

}




