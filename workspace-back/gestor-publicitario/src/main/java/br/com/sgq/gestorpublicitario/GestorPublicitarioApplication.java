package br.com.sgq.gestorpublicitario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GestorPublicitarioApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestorPublicitarioApplication.class, args);
	}

}
