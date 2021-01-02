package com.cfl.security.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类描述：
 *
 * @ClassName LoginController
 * @Description TODO
 * @Author msi
 * @Date 2020/12/29 22:55
 * @Version 1.0
 */
@RestController
public class LoginController {

    @RequestMapping(value = "/login-success",produces = {"text/plain;charset=UTF-8"})
    public String loginSuccess () {
        return "登录成功";
    }
}
