package com.ujon.jsjm.model.member;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class MemberDto {
    @NotNull
    private Long id;
}
