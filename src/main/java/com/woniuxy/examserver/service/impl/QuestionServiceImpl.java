package com.woniuxy.examserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxy.examserver.entity.Question;
import com.woniuxy.examserver.service.QuestionService;
import com.woniuxy.examserver.mapper.QuestionMapper;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【question(题目表)】的数据库操作Service实现
* @createDate 2026-07-23 16:05:11
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question>
    implements QuestionService{

}




