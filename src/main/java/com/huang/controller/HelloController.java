package com.huang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
    @RequestMapping(value="/hello.do",method=RequestMethod.POST)//GET方法
    @ResponseBody
    public String selectAlarmInformation(HttpServletRequest request,
			HttpServletResponse response) {

    	System.out.println("Controller run!");
		// 设置编码
//		response.setContentType("text/html;charset=utf-8");
//    	userService.update(user);
    	
//    	System.out.println("Controller end!");
    	return "hello!";
	}
}
