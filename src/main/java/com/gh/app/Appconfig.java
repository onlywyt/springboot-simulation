package com.gh.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.gh.app")
public class Appconfig implements WebMvcConfigurer {

    //配置URL 前后缀
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp().suffix("/");
    }



    //配置URL 前后缀
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/");
        internalResourceViewResolver .setSuffix(".jsp");
        return internalResourceViewResolver;
    }


}
