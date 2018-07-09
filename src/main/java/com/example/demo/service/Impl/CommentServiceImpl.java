package com.example.demo.service.Impl;

import javax.annotation.Resource;

import com.example.demo.dao.CommentDao;
import com.example.demo.domain.Comment;
import com.example.demo.service.CommentService;

import org.springframework.stereotype.Service;

@Service("commentService")
public class CommentServiceImpl implements CommentService{
    @Resource
    private CommentDao commentDao;
    public  Comment findComment(String article_name){
        return commentDao.findComment(article_name);
    }
    public int addComment(Comment comment){
        return commentDao.addComment(comment);
    }
}