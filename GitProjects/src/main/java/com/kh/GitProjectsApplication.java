package com.kh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitProjectsApplication {
	
	
	@GetMapping("/some")
	public String getdata() {
		return "get some data";
	}
	
	
	public String bye() {
		return "bye";

	public static void main(String[] args) {
		SpringApplication.run(GitProjectsApplication.class, args);
	}

}
