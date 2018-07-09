package com.example.demo.controller;

import javax.annotation.Resource;

import com.example.demo.domain.Comment;
import com.example.demo.service.CommentService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class CommentController {
	@Resource
	private CommentService commentService;

	@RequestMapping("/findComment")
	@ResponseBody
	public Comment findComment(String article_name){
		return commentService.findComment(article_name);
	}
	@RequestMapping("/addComment")
	public int addComment(Comment comment){
		return commentService.addComment(comment);
	}
}
