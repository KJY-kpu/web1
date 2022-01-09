//본 프로젝트의 메인 클래스
package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication      //스프링 부트의 자동 설정, 스프링 Bean 읽기와 생성을 모두 자동으로 설정, 이 위치부터 설정을 이어나가가기에 최상단 위치
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);     //내장 웹 애플리케이션 서버 WAS 실행
    }
}
