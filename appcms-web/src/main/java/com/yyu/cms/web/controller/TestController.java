package com.yyu.cms.web.controller;

import com.yyu.cms.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String welcome(@PathVariable String name) {
        return "hello " + name;
    }

    @RequestMapping(value = "/calc/{a}/{b}", method = RequestMethod.GET)
    @ResponseBody
    public String calc(@PathVariable int a, @PathVariable int b) {
        int result = testService.calc(a, b);
        return  a + "加" + b + "的结果为" + result;
    }
}
