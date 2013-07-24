package com.tg.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.opensymphony.xwork2.ActionSupport;
import com.tg.entity.Comment;

public class CommentAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int placeNum;
	
	private float rank;
	private String comment;
	
	private List<Comment> data;
	
	private String result;
	
	public String addComment(){
		System.out.println("rank:"+rank+"  comment:"+comment);
		result="success";
		return SUCCESS;
	}
	public String comments(){
		System.out.println("id="+placeNum);
		//从数据库读取评论信息
		if(placeNum>=0){
			data = new ArrayList<Comment>();
			Comment comment=new Comment();
			comment.setCommentator("xubinbin");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);

			comment=new Comment();
			comment.setCommentator("aaaaaaaa");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);
			
			comment=new Comment();
			comment.setCommentator("bbbbbbbb");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);
			
			comment=new Comment();
			comment.setCommentator("bbbbbbbb");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);
			comment=new Comment();
			comment.setCommentator("bbbbbbbb");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);
			comment=new Comment();
			comment.setCommentator("bbbbbbbb");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);
			comment=new Comment();
			comment.setCommentator("bbbbbbbb");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);
			comment=new Comment();
			comment.setCommentator("bbbbbbbb");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);
			comment=new Comment();
			comment.setCommentator("bbbbbbbb");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);
			comment=new Comment();
			comment.setCommentator("bbbbbbbb");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);
			comment=new Comment();
			comment.setCommentator("bbbbbbbb");
			comment.setScore(5);
			comment.setContent("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
			comment.setDate(new Date());
			data.add(comment);
			result="success";
			return SUCCESS;
		}else{
			result="fail";
			return ERROR;
		}
	}
	

 
	public float getRank() {
		return rank;
	}
	public void setRank(float rank) {
		this.rank = rank;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getPlaceNum() {
		return placeNum;
	}
	public void setPlaceNum(int placeNum) {
		this.placeNum = placeNum;
	}

	public List<Comment> getData() {
		return data;
	}
	public void setData(List<Comment> data) {
		this.data = data;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
	
}
