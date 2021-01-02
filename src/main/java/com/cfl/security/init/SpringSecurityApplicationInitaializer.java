package com.cfl.security.init;

import com.cfl.security.config.ApplicationConfig;
import com.cfl.security.config.WebConfig;
import com.cfl.security.config.WebSecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 类描述：
 *
 * @ClassName SpringSecurityApplicationInitaializer
 * @Description TODO
 * @Author msi
 * @Date 2020/12/29 22:32
 * @Version 1.0
 */
public class SpringSecurityApplicationInitaializer extends AbstractSecurityWebApplicationInitializer {

    public SpringSecurityApplicationInitaializer() {
//        super(WebSecurityConfig.class);
    }
}
