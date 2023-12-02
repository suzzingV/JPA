package com.jpabook.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Member extends BaseEntity {
    
    @Id @GeneratedValue //데이터베이스에서 식별자 자동생성
    @Column(name = "MEMBER_ID")
    private Long id;
    
    private String city;
    private String street;
    private String zipcode;

    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();
}
