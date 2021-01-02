package com.cfl.security.init;

import com.cfl.security.config.ApplicationConfig;
import com.cfl.security.config.WebConfig;
import com.cfl.security.config.WebSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 类描述：
 *
 * @ClassName SpringApplicationInitaializer
 * @Author msi
 * @Date 2020/12/29 22:32
 * @Version 1.0
 */
public class SpringApplicationInitaializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**
     * spring 容器，相当于 applicationContext.xml
     * @return
     */
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class, WebSecurityConfig.class};
    }

    /**
     * servletContext 相当于 springmvc.xml
     * @return
     */
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * url-mapping
     * @return
     */
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
