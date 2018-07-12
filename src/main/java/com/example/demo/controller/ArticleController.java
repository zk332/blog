package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

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
	public int insertArticle(HttpServletRequest request){
		if(articleService.findArticleByName(request.getParameter("article_name"))==null) {		
			Article article=new Article();
			article.setArticle(request.getParameter("article"));
			article.setArticle_name(request.getParameter("article_name"));
			article.setArticle_intro(request.getParameter("article_intro"));
			article.setTag1(request.getParameter("tag1").toString());
			article.setTag2(request.getParameter("tag2").toString());
			Date date = new Date();
			//转换提日期输出格式
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			article.setDate(dateFormat.format(date));
			String name=request.getParameter("userName");
					//request.getSession().getAttribute("userName").toString();
			article.setAuthor(name);
			return articleService.addArticle(article);
		
		}
		return -1;
	}	
	@RequestMapping(value="/findAll")
	public List<Article> findAll() {
		return articleService.findAll();
	}
}
