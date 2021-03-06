package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Article;;

@Component
@Mapper
public interface ArticleDao {
    //查找博客
    @Select("select * from article where article_name=#{artcle_name}")
    Article findArticleByName(String article_name);
    //发表博客
    @Insert("insert into article (article,author,article_name,article_intro,date,tag1,tag2) "
    		+ "values(#{article},#{author},#{article_name},#{article_intro},#{date},#{tag1},#{tag2})")
    int addArticle(Article article);
    @Select("select * from article")
    List<Article> findAll();
    @Select("select count(*) from article")
    int findPages();
    @Select("select * from article order by date limit #{num},#{num1}")
    List<Article> getPageArticle(int num,int num1);
}
