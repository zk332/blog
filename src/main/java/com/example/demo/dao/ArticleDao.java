package com.example.demo.dao;

import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import com.example.demo.domain.Article;;

@Component
@Mapper
public interface ArticleDao {
    //查找博客
    @Select("select * from article where article_id=#{artcle_name}")
    Article findArticleByName(String article_name);
    //发表博客
    @Insert("insert into article (article,author,article_name,article_intro,date,tag1,tag2) "
    		+ "values(#{article},#{author},#{article_name},#{article_intro},#{date},#{tag1},#{tag2})")
    int addArticle(Article article);
}
