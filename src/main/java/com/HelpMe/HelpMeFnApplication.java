package com.HelpMe;

import javax.annotation.Resource;

import com.HelpMe.service.IFileService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class HelpMeFnApplication implements CommandLineRunner{

	@Resource
	IFileService fileService;
	
	public static void main(String[] args) {
		SpringApplication.run(HelpMeFnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		fileService.deleteAll();
		fileService.init();
	}

	/* En caso que tenga problema con los cors agregar este Bean */
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT", "DELETE");
			}
		};
	}
}
