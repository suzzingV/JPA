package com.jpabook.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Member {
    
    @Id @GeneratedValue //데이터베이스에서 식별자 자동생성
    @Column(name = "MEMBER_ID")
    private Long id;
    
    private String city;
    private String street;
    private String zipcode;
}
