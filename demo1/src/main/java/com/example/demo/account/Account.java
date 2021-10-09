package com.example.demo.account;


//생성자를 자동으로 생성해주는 애노테이션들입니다.
import lombok.AllArgsConstructor; //이 어노테이션은 모든 필드 값을 파라미터로 받는 생성자를 만들어줌
import lombok.Builder;  //빌더 패턴을 사용하게 해줌
import lombok.Getter;   //데이터를 가져오는거
import lombok.NoArgsConstructor;    //이 어노테이션은 파라미터가 없는 기본 생성자를 생성해줌

import javax.persistence.*;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Account {

//  primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//  Column은 기본값으로 안써도 되지만 유니크 값 등을 설정할 때는 써줘야됨.
    @Column(unique = true)
    private String phone;

    private String name;

    private String password;
}
