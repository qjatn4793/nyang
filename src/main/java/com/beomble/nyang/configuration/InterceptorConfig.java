package com.beomble.nyang.configuration;

import com.beomble.nyang.configuration.interceptor.LoginCheckInterceptor;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@AllArgsConstructor
@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter {
    LoginCheckInterceptor loginCheckInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginCheckInterceptor)
                .addPathPatterns("/*")
                .excludePathPatterns("/login")
                .excludePathPatterns("/loginProc")
                .excludePathPatterns("/logout")
                .excludePathPatterns("/");

    }
}
