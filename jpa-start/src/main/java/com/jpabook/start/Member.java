package com.jpabook.start;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity //이 클래스를 테이블과 매핑한다고 JPA에게 알려줌
@Table(name = "MEMBER") //생략 시 클래스 이름을 테이블 이름으로 매핑 (정확히는 엔티티 이름 사용)
public class Member {

    @Id //테이블의 기본키에 매핑 //@Id가 사용된 필드: 식별자 필드
    @Column(name = "ID")
    private String id;

    @Column(name = "NAME")
    private String username;

    private Integer age; //매핑 어노테이션 생략 -> 필드명 이용해 컬럼명으로 매핑
    //대소문자 구분하는 데이터베이스는 명시해줘야함
}
