package com.example.demo.host;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Getter

//기본 생성자, 전체 생성자 > 두개 있어야 빌더 사용가능
@NoArgsConstructor
@AllArgsConstructor

public class Host {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String user_id;

    private int start_node;

    private int end_node;

    private int time;

    private boolean direction;

}
