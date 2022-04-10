package com.msb.conntroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: luyuting
 * @Date: 2022/4/8 - 04 - 08 - 16:59
 * @Description: com.msb.conntroller
 * @version: 1.0
 */
@RestController
public class TestDataController {
    @RequestMapping(value = "/getDataController")
    public String getParam2(String username,String password){
        System.out.println("用户名"+username);
        System.out.println("密码"+password);
        return "aaa";
    }
}
