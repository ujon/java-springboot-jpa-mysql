package com.ujon.jsjm.model.member;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class MemberAddDto {
    @NotNull
    private String name;
    @NotBlank
    private String password;
}
