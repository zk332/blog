package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.domain.Reply;
import com.example.demo.service.ReplyService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ReplyController {
	@Resource
	private ReplyService replyService;

	@RequestMapping("/findReply")
	@ResponseBody
	public List<Reply> findReply(int comment_id){
		return replyService.findReply(comment_id);
	}
	@RequestMapping("/insertReply")
	public int insertReply(Reply reply){
		return replyService.addReply(reply);
	}

	
}
