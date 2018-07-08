package com.example.demo.controller;

import javax.annotation.Resource;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
	@Resource
	private UserService userService;

	@GetMapping("/selectUser")
	@ResponseBody
	public User selectUser(User user){
		String name=user.getUserName();
		return userService.findUserByName(name);
	}
	@GetMapping("/insertUser")
	public int insertUser(User user){
		return userService.addUser(user);
	}
	@GetMapping("/updateEmail")
	public int updateEmail(User user){
		return userService.updateEmail(user);
	}
	@GetMapping("/updatePassword")
	public int updatePassword(User user){
		return userService.updatePassword(user);
	}
}
