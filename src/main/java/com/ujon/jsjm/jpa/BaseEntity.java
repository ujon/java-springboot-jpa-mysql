package com.ujon.jsjm.jpa;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@EntityListeners({AuditingEntityListener.class})
@Getter
@MappedSuperclass
public class BaseEntity {

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private Date created;

    @LastModifiedDate
    @Column(nullable = false, updatable = true)
    private Date updated;

}
