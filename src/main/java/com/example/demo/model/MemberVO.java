package com.example.demo.model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "member")//JPA가 관리하는 Class, 테이블과 매핑할 테이블은 해당 어노테이션을 붙인다.
public class MemberVO {

    @Id //@id를 사용하여 기본키(PK)로 지정한다.
    //AUTO_INCREMENT 직접할당 방식이 아닌, 자동으로 생성되도록 설정
    //GenerationType.IDENTITY 는 기본키 생성을 데이터 베이스에 위임하는 방식.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberNo;

    private String id;

    private String name;

    @Builder
    public MemberVO(String id, String name){
        this.id = id;
        this.name = name;
    }
}
