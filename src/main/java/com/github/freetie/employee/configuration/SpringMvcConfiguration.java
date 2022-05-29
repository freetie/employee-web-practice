package com.github.freetie.employee.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.github.freetie.employee.controller")
@EnableWebMvc
public class SpringMvcConfiguration {

}
