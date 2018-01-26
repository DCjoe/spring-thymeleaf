package com.autohome.springthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;



@EnableAutoConfiguration
@ServletComponentScan
@SpringBootApplication
public class SpringThymeleafApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SpringThymeleafApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringThymeleafApplication.class, args);
	}
}
