package com.example.demo.service.Impl;

import javax.annotation.Resource;

import com.example.demo.dao.ReplyDao;
import com.example.demo.domain.Reply;
import com.example.demo.service.ReplyService;

import org.springframework.stereotype.Service;


@Service("replyService")
public class ReplyServiceImpl implements ReplyService{
    @Resource
    private ReplyDao replyDao;
    public Reply findReply(int comment_id){
        return replyDao.findReply(comment_id);
    }
    public int addReply(Reply reply){
        return replyDao.addReply(reply);
    }
   
}