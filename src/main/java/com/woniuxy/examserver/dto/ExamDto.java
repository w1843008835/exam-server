package com.woniuxy.examserver.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Builder
@Data
public class ExamDto {
    private String id;
    private String title;
    private String description;
    private Integer questionCount;
    private String coverImage;

}
