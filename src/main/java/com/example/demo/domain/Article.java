package com.example.demo.domain;


public class Article{
    private int article_id;
    private String article_name;
    private String author;
	private String article;
	private String article_intro;
	private String date;
	private String tag1;
	private String tag2;
	private int praise;
	private int click;
	
	public String getTag1() {
		return tag1;
	}
	public void setTag1(String tag1) {
		this.tag1 = tag1;
	}
	public String getTag2() {
		return tag2;
	}
	public void setTag2(String tag2) {
		this.tag2 = tag2;
	}
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
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
	public int  getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click =click;
	}
	public int  getPraise() {
		return praise;
	}
	public void setPraise(int praise) {
		this.praise =praise;
    }
   
}