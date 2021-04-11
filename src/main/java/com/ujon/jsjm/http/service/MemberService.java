package com.ujon.jsjm.http.service;


import com.ujon.jsjm.exception.EntityNotFoundException;
import com.ujon.jsjm.jpa.entity.Member;
import com.ujon.jsjm.jpa.repository.MemberRepository;
import com.ujon.jsjm.model.member.MemberAddDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    public Member getMemberById(Long id) {
        return memberRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Invalid member id"));
    }

    public Member addMember(MemberAddDto req) {
        Member member = new Member();
        member.setUsername(req.getName());
        member.setPassword(req.getPassword());
        return memberRepository.save(member);
    }
}
