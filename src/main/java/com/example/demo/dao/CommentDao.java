package com.example.demo.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import com.example.demo.domain.*;

@Component
@Mapper
public interface CommentDao {
    //查找用户
    @Select("select * from user where userName=#{userName}")
    User findUserByName(String userName);
    //注册用户
    @Insert("insert into user(userName,password,email) values(#{userName},#{password},#{email})")
    int addUser(User user);
    //修改邮箱
    @Update("update user set email=#{email} where name=#{userName}")
    int updateEmail(String email);
    //修改密码
    @Update("update user set password=#{password} where name=#{userName}")
    int updatePassword(String password);
}
