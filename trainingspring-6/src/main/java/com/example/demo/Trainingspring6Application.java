package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo.repository")
public class Trainingspring6Application {

	public static void main(String[] args) {
		SpringApplication.run(Trainingspring6Application.class, args);
	}

}
