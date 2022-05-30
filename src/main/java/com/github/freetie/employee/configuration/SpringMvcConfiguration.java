package com.github.freetie.employee.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.github.freetie.employee.entity.Employee;

@Configuration
@ComponentScan("com.github.freetie.employee.controller")
@EnableWebMvc
public class SpringMvcConfiguration implements WebMvcConfigurer {

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/");
		resolver.setSuffix(".jsp");

		registry.viewResolver(resolver);
	}

	class LoginInterceptor implements HandlerInterceptor {

		@Override
		public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
				throws Exception {
			if (request.getRequestURI().contains("login")) {
				return true;
			}
			Employee user = (Employee) request.getSession().getAttribute("user");
			if (user == null) {
				request.getRequestDispatcher("/WEB-INF/pages/login.jsp").forward(request, response);
				return false;
			}
			return true;
		}

	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/employee", "/employee/*");
	}
}
