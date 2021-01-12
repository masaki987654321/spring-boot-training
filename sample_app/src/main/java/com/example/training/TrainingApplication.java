package com.example.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class TrainingApplication {

	@RequestMapping("/")
	public String home() {
		return "hello world!";
	}

	public static void main(String[] args) {
        SpringApplication.run(TrainingApplication.class, args);
    }

}
