package com.cognizant.pharmacymanagement.home;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HomeApplication implements ServletContextInitializer{

	public static void main(String[] args) {
		SpringApplication.run(HomeApplication.class, args);
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.getSessionCookieConfig().setName("PmsSession");
	}

}
