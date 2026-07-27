package com.woniuxy.examserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxy.examserver.entity.QuestionOption;
import com.woniuxy.examserver.service.QuestionOptionService;
import com.woniuxy.examserver.mapper.QuestionOptionMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【question_option(题目选项表)】的数据库操作Service实现
* @createDate 2026-07-24 13:55:58
*/
@Service
public class QuestionOptionServiceImpl extends ServiceImpl<QuestionOptionMapper, QuestionOption>
    implements QuestionOptionService{

}




