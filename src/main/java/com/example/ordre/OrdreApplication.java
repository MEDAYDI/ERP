package com.example.ordre;

import com.example.ordre.dto.Response;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class OrdreApplication {


	public static void main(String[] args) {
		SpringApplication.run(OrdreApplication.class, args);

	}

}
