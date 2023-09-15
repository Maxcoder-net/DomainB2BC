package com.example.tier1;

import java.io.Serializable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.ControllerAdvice;

@SpringBootApplication

public class MaxdigiApplication implements Serializable{

	public static void main(String[] args) {
		SpringApplication.run(MaxdigiApplication.class, args);
	}

}
