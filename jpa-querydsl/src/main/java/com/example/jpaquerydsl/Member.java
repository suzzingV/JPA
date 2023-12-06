package com.example.jpaquerydsl;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity //이 클래스를 테이블과 매핑한다고 JPA에게 알려줌
@Table(name = "MEMBER", uniqueConstraints = {@UniqueConstraint(
        name = "NAME_AGE_UNIQUE",
        columnNames = {"NAME", "AGE"} //유니크 제약조건
)})
public class Member {
    @Id //테이블의 기본키에 매핑 //@Id가 사용된 필드: 식별자 필드
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "NAME", nullable = false, length = 10)
    private String username;

    private Integer age; //매핑 어노테이션 생략 -> 필드명 이용해 컬럼명으로 매핑
    //대소문자 구분하는 데이터베이스는 명시해줘야함

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;


    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;
}
