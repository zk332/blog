package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.Article;

public interface ArticleService{
    public Article findArticleByName(String article_name);
    public int addArticle(Article article);
    public List<Article> findAll();
    public int findPages();
    public List<Article> findPageArticle(int num,int num1);
}