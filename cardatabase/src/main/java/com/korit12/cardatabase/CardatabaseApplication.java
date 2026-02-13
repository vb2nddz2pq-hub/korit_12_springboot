package com.korit12.cardatabase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.alf4j.Logger;


@SpringBootApplication
public class CardatabaseApplication {

	public static void main(String[] args) {
		final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);

		SpringApplication.run(CardatabaseApplication.class, args);
		logger.info("애플리케이션이 실행됩니다");
	}

}
