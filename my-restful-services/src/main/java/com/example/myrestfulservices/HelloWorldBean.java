package com.example.myrestfulservices;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor //클래스에 존재하는 모든 필드에 대한 생성자를 자동으로 생성
@NoArgsConstructor //파라미터가 없는 생성자를 생성
public class HelloWorldBean {
    //Bean Class 란 :
    //특정한 정보 (id, password, name, job...)등을 가지고 있는 클래스를 표현하는 하나의 규칙이고,
    // 데이터를 표현하기 위한 목적을 지니고 있음.
    // 이 규칙을 지닌 클래스를 Java Bean 이라고 함.

    //반드시 클래스는 패키지화 되어야 함
    //멤버변수는 property(프로퍼티)라고 함
    //멤버변수는 private로 지정하고, 외부접근을 위한 get, set 메소드를 정의해야 함
    //get, set 메소드는 public으로 지정
    private String message;
}
