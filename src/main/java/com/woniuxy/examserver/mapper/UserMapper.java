package com.woniuxy.examserver.mapper;

import com.woniuxy.examserver.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author admin
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2026-07-25 16:14:33
* @Entity com.woniuxy.examserver.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




