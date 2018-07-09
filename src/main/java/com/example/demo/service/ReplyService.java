package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Reply;

public interface ReplyService{
    public List<Reply> findReply(int comment_id);
    public int addReply(Reply reply);
}