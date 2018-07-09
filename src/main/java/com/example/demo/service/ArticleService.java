package com.example.demo.service;

import com.example.demo.domain.Article;

public interface ArticleService{
    public Article findArticleByName(String article_name);
    public int addArticle(Article article);
}