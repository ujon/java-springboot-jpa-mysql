package com.ujon.jsjm.jpa.repository;

import com.ujon.jsjm.jpa.entity.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Long> {
}
