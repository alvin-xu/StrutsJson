package cn.redarmy.domain;

import java.util.Date;

public class Comment {
	
	private String orderNo;       //评价序号
	private String viewNo;        //景点编号
	private String commentator;   //评价人
	private String content;       //评价内容
	private int score;            //评价分数
	private Date date;            //评价时间
	
	/*Getters and Setters*/
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getViewNo() {
		return viewNo;
	}
	public void setViewNo(String viewNo) {
		this.viewNo = viewNo;
	}
	public String getCommentator() {
		return commentator;
	}
	public void setCommentator(String commentator) {
		this.commentator = commentator;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
