package com.hwhang0917.forward_demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import static com.hwhang0917.forward_demo.common.CommonData.*;

@Configuration
public class ApiConfiguration extends WebMvcConfigurationSupport {

    public ApiConfiguration() {
        super();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("forward:/index.html");
    }

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        String path = "file:/" + staticLocation;

        registry.addResourceHandler("/**")
                .addResourceLocations(path + "/dist/")
                .addResourceLocations(path);
    }


}

