package com.woniuxy.examserver.mapper;

import com.woniuxy.examserver.dto.ExamDto;
import com.woniuxy.examserver.entity.Tiku;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author admin
* @description 针对表【tiku(题库表)】的数据库操作Mapper
* @createDate 2026-07-24 17:16:13
* @Entity com.woniuxy.examserver.entity.Tiku
*/

@Mapper
public interface TikuMapper extends BaseMapper<Tiku> {
    List<ExamDto> queryTikus();
}




