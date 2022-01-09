//61p
package com.example.springboot;

import com.example.springboot.web.HelloController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)        //스프링부트 테스트와 JUnit 사이의 연결자
@WebMvcTest(controllers = HelloController.class)        //웹에 집중할 수 있는 어노테이션
public class HelloControllerTest {

    @Autowired      //스프링이 관리하는 빈을 주입받음
    private MockMvc mvc;        //웹 API 테스트, 스프링 MVC 테스트의 시작점

    @Test
    public void hello가_리턴된다() throws Exception {
        String hello = "hello";

        mvc.perform(get("/hello")).andExpect(status().isOk()).andExpect(content().string(hello));
        //MockMvc를 통해 /hello 주소로 HTTP GET 요청 , mvc.perform의 결과와 HTTP Header Status 검증(200,404 등) OK(200)인지 아닌지 , 응답 본문의 내용 검증 hello리턴이 맞는지
    }
}
