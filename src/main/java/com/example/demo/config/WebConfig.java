package com.example.demo.config;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.example.demo.interceptor.MyInterceptor;
@Configuration
public class WebConfig extends WebMvcConfigurationSupport {
	@Autowired
	MyInterceptor myInterceptor;
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*", "null")
                .allowedMethods("POST", "GET", "PUT", "OPTIONS", "DELETE")
                .maxAge(3600)
                .allowCredentials(true);
    }
	 @Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	       //registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
	       String str="/src/main/resources/static/";
	       File directory = new File("");
	       String fullFilePath = directory.getAbsolutePath();
	       registry.addResourceHandler("/**").addResourceLocations("file:"+fullFilePath+str);
	       super.addResourceHandlers(registry);
	    }
	 @Override
	 public void addInterceptors(InterceptorRegistry registry) {
	        // addPathPatterns 用于添加拦截规则
	        // excludePathPatterns 用户排除拦截
	        // 映射为 user 的控制器下的所有映射
		 registry.addInterceptor(myInterceptor).addPathPatterns("/login").excludePathPatterns("/index", "/");
	        super.addInterceptors(registry);
	    }


}
