package com.msb.conntroller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.msb.pojo.Person;
import com.msb.pojo.Pet;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.PrinterName;

/**
 * @Auther: luyuting
 * @Date: 2022/4/9 - 04 - 09 - 15:08
 * @Description: com.msb.conntroller
 * @version: 1.0
 */
//@Controller
    @RestController
public class ajaxController {
    /**
     * @ResponseBody
     * 方法的返回值，不在作为页面的跳转依据
     * 将返回的数值使用ObjectMapper转化成Json
     */
    //@ResponseBody
    @RequestMapping("testAjax")
    public Pet testAjax(Person p) throws JsonProcessingException {
        System.out.println("ajax方法执行了");
        System.out.println(p);
        //System.out.println(pname +page);
        Pet pet =new Pet("Tom","cat");
        return pet;
    }
}
