package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringApplication {

	public static void main(String[] args) {
		// Tomcat 내장 웹서버를 실행
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
