package com.ujon.jsjm.jpa.repository;

import com.ujon.jsjm.jpa.entity.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudRepository<Member,Long> {
}
