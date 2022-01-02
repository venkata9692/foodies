package com.foodies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class FoodiesApplication implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/");
		System.out.println("addResourceHandler()");
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("index");
		registry.addViewController("/about").setViewName("about");
		registry.addViewController("/team").setViewName("team");
		registry.addViewController("/special-dishes").setViewName("special-dishes");
		registry.addViewController("/menu").setViewName("menu");
		System.out.println("addViewControllers()");
	}

	public static void main(String[] args) {
		SpringApplication.run(FoodiesApplication.class, args);
	}

}
