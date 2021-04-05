package com.demo.learngraphql.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class SpringInterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    TestingInterceptor testingInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(testingInterceptor).addPathPatterns("/**");
    }
}
