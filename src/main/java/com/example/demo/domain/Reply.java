package com.example.demo.domain;


public class Reply{
private int reply_id;
	private String reply;
	private String comment_id;
	private String date;
	public int getReply_id() {
		return reply_id;
	}
	public void setReply_id(int reply_id) {
		this.reply_id = reply_id;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public String getComment_id() {
		return comment_id;
	}
	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date =date;
    }
}