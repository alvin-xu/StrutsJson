package com.tg.entity;

import java.util.Date;

public class Comment {
	
	private int orderNo;       //�������
	private String viewNo;        //������
	private String commentator;   //������
	private String content;       //��������
	private float score;            //���۷���
	private Date date;            //����ʱ��
	
	/*Getters and Setters*/
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
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
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
