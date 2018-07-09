package com.example.demo.domain;


public class Article{
    private int article_id;
    private String article_name;
    private int author;
	private String article;
	private String article_intro;
	private String date;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date =date;
    }
    public int getArticle_id() {
		return article_id;
	}
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}
	public String getArticle_name() {
		return article_name;
	}
	public void setArticle_name(String article_name) {
		this.article_name = article_name;
	}
	public int getAuthor() {
		return author;
	}
	public void setAuthor(int author) {
		this.author = author;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public String getArticle_intro() {
		return article_intro;
	}
	public void setArticle_intro(String article_intro) {
		this.article_intro = article_intro;
	}
	
   
}