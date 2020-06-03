package com.example.springbootservletfilterlistener.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

    @ResponseBody
    @RequestMapping("/filter/**")
    public String doFilter(HttpServletRequest request) {
        System.out.println("DemoController.doFilter");
        return request.getAttribute("filter").toString();
    }
}
