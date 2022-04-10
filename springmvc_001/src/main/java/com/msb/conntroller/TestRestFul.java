package com.msb.conntroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Auther: luyuting
 * @Date: 2022/4/8 - 04 - 08 - 15:35
 * @Description: com.msb.conntroller
 * @version: 1.0
 */
@Controller
public class TestRestFul {
    @RequestMapping(value = "testRestFul/{id}", method = RequestMethod.POST)
    public String testPost(@PathVariable("id") String id) {
        System.out.println("以Post方式传入" + id);
        return "first";
    }

    @RequestMapping(value = "testRestFul/{id}", method = RequestMethod.GET)
    public String testGet(@PathVariable("id") String id) {
        System.out.println("以Get方式传入" + id);
        return "first";
    }
}
