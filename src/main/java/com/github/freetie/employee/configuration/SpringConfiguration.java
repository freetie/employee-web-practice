package com.github.freetie.employee.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.github.freetie.employee") 
@PropertySource("jdbc.properties")
public class SpringConfiguration  {
    
}