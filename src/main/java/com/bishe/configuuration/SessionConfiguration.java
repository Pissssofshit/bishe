package com.bishe.configuuration;

import com.bishe.Interceptor.SysInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class SessionConfiguration extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new SysInterceptor()).addPathPatterns("/**").excludePathPatterns("/").excludePathPatterns("/user/login").excludePathPatterns("/user/register").excludePathPatterns("/data/te").excludePathPatterns("/data/te2").excludePathPatterns("/data/te3").excludePathPatterns("/rec/cal").excludePathPatterns("/rec/calPerson");
        super.addInterceptors(registry);
    }
}
