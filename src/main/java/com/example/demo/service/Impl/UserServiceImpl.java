package com.example.demo.service.Impl;

import javax.annotation.Resource;

import com.example.demo.dao.UserDao;
import com.example.demo.domain.User;
import com.example.demo.service.UserService;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource
    private UserDao userDao;

    public User findUserByName(String name){
        return userDao.findUserByName(name); 
    } 
    public int addUser(User user){
            return userDao.addUser(user);
    }
    public int updateEmail(User user){
        return userDao.addUser(user);
    }
    public int updatePassword(User user){
        return userDao.addUser(user);
    }
}