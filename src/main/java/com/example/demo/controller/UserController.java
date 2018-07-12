package com.example.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class UserController {
	@Resource
	private UserService userService;
	private Cookie cookie1;
	private Cookie cookie2;
	@RequestMapping("/login")
	public String login(HttpServletRequest request,HttpServletResponse response){
		String name=request.getParameter("userName");
		String password=request.getParameter("password");
		String password2=userService.findUserByName(name).getPassword();
		if(password.equals(password2)){
			cookie1=new Cookie("name",name);
			cookie2=new Cookie("password", password);
			request.getSession().setAttribute("userName",name);
			System.out.println(name);
			return "1";
		}
		return "0";
	}
	@RequestMapping("/isLogined")
	public int isLogined(HttpServletRequest request){
		if(request.getSession().getAttribute("userName")!=null)
			return 1;
		return 0;
			
	}
	@RequestMapping("/autoLogin")
	public String autoLogin(HttpServletRequest request,HttpServletResponse response){
		Cookie[] cookies =  request.getCookies();
		String name="";
		String password="";
        if(cookies != null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("name")){
                    name=cookie.getValue();
				}
				else if(cookie.getName().equals("password"))
					password=cookie.getValue();
			}
			String password2=userService.findUserByName(name).getPassword();
			if(password.equals(password2)){
				cookie1=new Cookie("name",name);
				cookie2=new Cookie("password", password);
				response.addCookie(cookie1);
				response.addCookie(cookie2);
				return name;
			}
		}
		return " ";
	}
	@RequestMapping("/selectUser")
	@ResponseBody
	public User selectUser(User user,HttpServletResponse response){
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
	@RequestMapping("/register")
	public int insertUser(User user){
		if(userService.findUserByName(user.getUserName())!=null) {
			return 0;
		}
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
