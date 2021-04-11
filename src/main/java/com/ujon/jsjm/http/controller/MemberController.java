package com.ujon.jsjm.http.controller;


import com.ujon.jsjm.http.service.MemberService;
import com.ujon.jsjm.jpa.entity.Member;
import com.ujon.jsjm.model.member.MemberAddDto;
import com.ujon.jsjm.model.member.MemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    public ResponseEntity<Member> member(@RequestBody MemberDto req) {
        return new ResponseEntity<Member>(memberService.getMemberById(req.getId()), HttpStatus.OK);
    }

    @PostMapping(value = "/add")
    public ResponseEntity<Member> addMember(@RequestBody MemberAddDto req) {
        return new ResponseEntity<Member>(memberService.addMember(req), HttpStatus.OK);
    }
}
