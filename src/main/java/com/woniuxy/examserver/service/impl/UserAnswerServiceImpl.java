package com.woniuxy.examserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.woniuxy.examserver.dto.SubmitAnswerDTO;
import com.woniuxy.examserver.entity.UserAnswer;
import com.woniuxy.examserver.service.UserAnswerService;
import com.woniuxy.examserver.mapper.UserAnswerMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
* @author admin
* @description 针对表【user_answer(用户答题记录表)】的数据库操作Service实现
* @createDate 2026-07-24 16:41:03
*/
@Slf4j
@Service
@RequiredArgsConstructor
public class UserAnswerServiceImpl extends ServiceImpl<UserAnswerMapper, UserAnswer>
    implements UserAnswerService{



}




