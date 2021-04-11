package com.ujon.jsjm.model.comment;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class CommentAddDto {
    @NotNull
    private Long memberId;

    @NotBlank
    private String comment;
}
