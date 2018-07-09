package com.example.demo.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.dao.CommentDao;
import com.example.demo.domain.Comment;
import com.example.demo.service.CommentService;

import org.springframework.stereotype.Service;

@Service("commentService")
public class CommentServiceImpl implements CommentService{
    @Resource
    private CommentDao commentDao;
    public  List<Comment> findComment(String article_name,int num,int num2){
        return commentDao.findComment(article_name,num,num2);
    }
    public int addComment(Comment comment){
        return commentDao.addComment(comment);
    }
}