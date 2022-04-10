package com.msb.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msb.pojo.Pet;
import org.junit.jupiter.api.Test;
import org.springframework.http.converter.json.Jackson2ObjectMapperFactoryBean;

/**
 * @Auther: luyuting
 * @Date: 2022/4/9 - 04 - 09 - 15:12
 * @Description: com.msb.test
 * @version: 1.0
 */
public class TestJson {
    @Test
    public void testA()throws Exception{
        Pet pet=new Pet("Tom","cat");
       ObjectMapper om=new ObjectMapper();
        String asString = om.writeValueAsString(pet);
        System.out.println(asString);

    }
}
