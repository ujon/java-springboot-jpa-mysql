package com.ujon.jsjm.http.controller;


import com.ujon.jsjm.http.service.CommentService;
import com.ujon.jsjm.jpa.entity.Comment;
import com.ujon.jsjm.model.comment.CommentAddDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping(value = "/add")
    public ResponseEntity<Comment> addMember(@RequestBody CommentAddDto req) {
        return new ResponseEntity<Comment>(commentService.addComment(req), HttpStatus.OK);
    }
}
