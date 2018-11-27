package com.song.woo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing//Jpa 날짜 자동 수정을 사용하기 위함
@SpringBootApplication
public class BootJpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootJpa1Application.class, args);
	}
}
