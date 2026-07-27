package com.woniuxy.examserver.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AnswerCardDto {
    private Integer correct;
    private Integer incorrect;
    private Integer undo;
    private List<AnswerCardOptionDto> options;
            ;
}
