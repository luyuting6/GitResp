package com.msb.conntroller;

import com.msb.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;

/**
 * @Auther: luyuting
 * @Date: 2022/4/8 - 04 - 08 - 22:04
 * @Description: com.msb.conntroller
 * @version: 1.0
 */
@Controller
public class ReceiveDataController {
    @RequestMapping("getDataPojo")
    public String getDataPojo(Person p){
        System.out.println(p);
        //System.out.println(p.getPets());
        return "redirect:index.jsp";
    }
    @RequestMapping("demo5")
    public ModelAndView testDemo5(Person p){
        ModelAndView mv=new ModelAndView();
        //请求转发的两种方式
        mv.setViewName("index.jsp");
       // mv.setView(new InternalResourceView("index.jsp"));
        //请求重定向的两种方式
      //  mv.setViewName("redirect:TestPojo.jsp");
        //mv.setView(new RedirectView("TestPojo.jsp"));
        return mv;
    }
}
