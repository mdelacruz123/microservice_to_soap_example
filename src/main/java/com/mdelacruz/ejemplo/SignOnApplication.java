package com.mdelacruz.ejemplo;

import com.mdelacruz.ejemplo.client.GQ091001Client;
import com.mdelacruz.ejemplo.dto.GQ091001Request;
import com.mdelacruz.ejemplo.wsdl.ResponseMessage;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SignOnApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignOnApplication.class, args);
	}

}
