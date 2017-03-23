package com.wydewy.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wydewy.manager.pojo.User;
import com.wydewy.manager.service.UserService;

@Controller
public class UserContrlloer {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/user/{id}")
	public @ResponseBody User getUserById(@PathVariable Long id){
		System.out.println("請求id="+id);
		User user = userService.getUserById(id);
		return user;	
	}
	
}
