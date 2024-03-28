package com.practice.registration;

import com.practice.registration.repository.userRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistrationApplication {
	private userRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
	}



}
