package com.cfl.security.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * 类描述：
 *  相当于 applicationContext.xml文件
 * @ClassName ApplicationConfig
 * @Description TODO
 * @Author msi
 * @Date 2020/12/29 22:21
 * @Version 1.0
 */
@Configuration
@ComponentScan(basePackages = "com.cfl.security", excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, value = Controller.class)})
//@ComponentScan(basePackages = "com.cfl.security")
public class ApplicationConfig {
}
