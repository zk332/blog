package com.example.demo.domain;


public class Comment {
    private int comment_id;
	private String comment;
	private String author;
	private String article_name;
	private int has_reply;
	public int getComment_id() {
		return comment_id;
	}
	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getArticle_name() {
		return article_name;
	}
	public void setArticle_name(String article_name) {
		this.article_name = article_name;
	}
	public int getHas_reply() {
		return has_reply;
	}
	public void setHas_reply(int has_reply) {
		this.has_reply = has_reply;
	}
	
}