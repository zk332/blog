package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Comment;

public interface CommentService{
    public List<Comment> findComment(String article_name,int num,int num2);
    public int addComment(Comment comment);
}