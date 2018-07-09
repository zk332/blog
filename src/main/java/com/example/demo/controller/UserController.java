package com.example.demo.controller;

import javax.annotation.Resource;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
	@Resource
	private UserService userService;

	@RequestMapping("/selectUser")
	@ResponseBody
	public User selectUser(User user){
		String name=user.getUserName();
		return userService.findUserByName(name);
	}
	@RequestMapping("/isNameRepeat")
	public int isNameRepeat(User user){
		User user2=userService.findUserByName(user.getUserName());
		if(user2==null)
			return 1;
		return 0;
	}
	@RequestMapping("/insertUser")
	public int insertUser(User user){
		return userService.addUser(user);
	}
	@RequestMapping("/updateEmail")
	public int updateEmail(User user){
		return userService.updateEmail(user);
	}
	@RequestMapping("/updatePassword")
	public int updatePassword(User user){
		return userService.updatePassword(user);
	}
}
