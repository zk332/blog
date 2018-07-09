package com.example.demo.service;

import com.example.demo.domain.Reply;

public interface ReplyService{
    public Reply findReply(int comment_id);
    public int addReply(Reply reply);
}