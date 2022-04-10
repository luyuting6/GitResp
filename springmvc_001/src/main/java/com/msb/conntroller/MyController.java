package com.msb.conntroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: luyuting
 * @Date: 2022/4/8 - 04 - 08 - 11:49
 * @Description: com.msb.conntroller
 * @version: 1.0
 */
@Controller
public class MyController {
    @RequestMapping(value = "Test",params="username")
    public String  Test(){
        System.out.println("张雪儿我爱你");
        return "first";
    }
    @RequestMapping(value = "firstController",method = RequestMethod.POST)
    public String  firstController(){
        System.out.println("post请求");
        System.out.println("张雪儿我爱你");
        return "first";
    }
}
