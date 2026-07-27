package com.woniuxy.examserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxy.examserver.dto.ExamDto;
import com.woniuxy.examserver.entity.Tiku;
import com.woniuxy.examserver.service.TikuService;
import com.woniuxy.examserver.mapper.TikuMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author admin
* @description 针对表【tiku(题库表)】的数据库操作Service实现
* @createDate 2026-07-24 17:16:13
*/
@Service
@RequiredArgsConstructor
public class TikuServiceImpl extends ServiceImpl<TikuMapper, Tiku>
    implements TikuService{

    private final TikuMapper tikuMapper;
    @Override
    public List<ExamDto> getTikus() {
        return tikuMapper.queryTikus();
    }
}




