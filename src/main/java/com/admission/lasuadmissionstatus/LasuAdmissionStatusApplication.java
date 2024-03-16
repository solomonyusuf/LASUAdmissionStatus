package com.admission.lasuadmissionstatus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class LasuAdmissionStatusApplication {

	public static void main(String[] args) {
		SpringApplication.run(LasuAdmissionStatusApplication.class, args);
	}

	@GetMapping("/")
	public String GetHome()
	{
		return "Hello World";
	}
}
