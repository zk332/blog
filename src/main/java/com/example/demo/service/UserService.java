package com.example.demo.service;

import com.example.demo.domain.User;

public interface UserService{
    public User findUserByName(String name); 
    public int addUser(User user);
    public int updateEmail(User user);
    public int updatePassword(User user);
}