package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller (아직 안 배운 어노테이션.. mvc에서 서블릿으로 만든 컨트롤러임) + @ResponseBody : 컨트롤러이면서 동시에 응답을 해주는 기능을 함
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	
	@GetMapping(value = "/") 
	public String HelloWorld() {
		return "Hello world!";
	}

}
