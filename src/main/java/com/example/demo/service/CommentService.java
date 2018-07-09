package com.example.demo.service;

import com.example.demo.domain.Comment;

public interface CommentService{
    public Comment findComment(String article_name);
    public int addComment(Comment comment);
}