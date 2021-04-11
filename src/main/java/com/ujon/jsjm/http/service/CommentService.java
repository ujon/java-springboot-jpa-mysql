package com.ujon.jsjm.http.service;


import com.ujon.jsjm.jpa.entity.Comment;
import com.ujon.jsjm.jpa.repository.CommentRepository;
import com.ujon.jsjm.model.comment.CommentAddDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class CommentService {
    private final CommentRepository commentRepository;
    private final MemberService memberService;

    public Comment addComment(CommentAddDto req) {
        Comment comment = new Comment();
        comment.setMember(memberService.getMemberById(req.getMemberId()));
        comment.setComment(req.getComment());
        return commentRepository.save(comment);
    }
}
