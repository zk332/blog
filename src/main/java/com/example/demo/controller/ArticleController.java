package com.example.demo.controller;

import javax.annotation.Resource;

import com.example.demo.domain.Article;
import com.example.demo.service.ArticleService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ArticleController {
	@Resource
	private ArticleService articleService;

	@RequestMapping("/selectArticle")
	@ResponseBody
	public Article selectUser(String article_name){
		return articleService.findArticleByName(article_name);
	}
	@RequestMapping("/insertArticle")
	public int insertArticle(Article article){
		return articleService.addArticle(article);
	}	
}
