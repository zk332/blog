package com.example.demo.service.Impl;

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
   
}