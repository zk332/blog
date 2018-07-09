package com.example.demo.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

import com.example.demo.domain.Comment;

@Component
@Mapper
public interface CommentDao {
   @Select("select * from comment where article_name=#{article_name} order by date limit #{num},#{num2}")
   List<Comment> findComment(String article_name,int num,int num2);
   @Insert("insert into comment(comment,author,article_name,has_reply,date) values(#{comment},#{author},#{article_name},#{has_reply},#{date})")
   int addComment(Comment comment);
}
