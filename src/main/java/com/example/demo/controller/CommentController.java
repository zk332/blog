package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
	public List<Comment> findComment(String article_name,int num){
		num=(num-1)*5;
		int num2=num+4;
		return commentService.findComment(article_name,num,num2);
	}
	@RequestMapping("/addComment")
	public int addComment(Comment comment){
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		comment.setDate(dateFormat.format(date));
		return commentService.addComment(comment);
	}
}
