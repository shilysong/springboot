package com.itnoobking.controller;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ConfigurationProperties(prefix = "person")
public class QuickStartController {

    //@Value("${person.name}")
    private String name;
    //@Value("${person.age}")
    private Integer age;

    @RequestMapping("/quick")
    @ResponseBody


    public String quick(){

        return "恭喜你！访问Springboot成功！name="+name+",age="+age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
