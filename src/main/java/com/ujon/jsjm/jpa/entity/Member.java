package com.ujon.jsjm.jpa.entity;

import com.ujon.jsjm.jpa.BaseEntity;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "member")
@Data
public class Member extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_id")
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
}
