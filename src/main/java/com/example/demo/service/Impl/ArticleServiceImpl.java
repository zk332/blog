package com.example.demo.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.dao.ArticleDao;
import com.example.demo.domain.Article;
import com.example.demo.service.ArticleService;

import org.springframework.stereotype.Service;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService{
    @Resource
    ArticleDao articleDao;
    public  Article findArticleByName(String article_name){
        return articleDao.findArticleByName(article_name);
    }
    public int addArticle(Article article){
        return articleDao.addArticle(article);
    }
	@Override
	public List<Article> findAll() {
		return articleDao.findAll();
	}
	public int findPages() {
		return articleDao.findPages();
	}
	public List<Article> findPageArticle(int num,int num1){
		return articleDao.getPageArticle(num, num1);
	}
   
}