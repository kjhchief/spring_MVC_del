package ezen.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 이 어노테이션이 모든 설정을 끝낸다. ppt 9페이지에 단독 실행 가능한 스프링애플리케이션.
@SpringBootApplication
public class SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args); // 이걸로 톰캣 구동 및 모든 설정 다 됨.
	}

}
