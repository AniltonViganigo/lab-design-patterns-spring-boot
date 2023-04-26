package one.digitalinnovation.labdesignpatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr
 * Selecionamos os seguintes módulos:
 *  -> Spring Data JPA
 *  -> Spring Web
 *  -> H2 Database
 *  -> OpenFeign
 * @author Anilton Jr.
 * */
@EnableFeignClients
@SpringBootApplication
public class LabDesignPatternsSpringProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabDesignPatternsSpringProjectApplication.class, args);
	}

}
