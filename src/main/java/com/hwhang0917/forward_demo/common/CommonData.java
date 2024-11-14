package com.hwhang0917.forward_demo.common;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CommonData implements InitializingBean {
    public static String staticLocation;

    @Autowired
    public void loadConfig(@Value("${resource.file-location}") String staticLocation) {
        CommonData.staticLocation = staticLocation;
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("properties loaded");
    }
}
