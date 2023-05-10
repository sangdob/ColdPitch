package com.ColdPitch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;


@Profile("prod")
@SpringBootApplication
public class ColdPitchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColdPitchApplication.class, args);
	}

}
