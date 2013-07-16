package cn.redarmy.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.redarmy.domain.Comment;

import com.opensymphony.xwork2.ActionSupport;

public class CommentAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int placeNum;
	private List<Comment> data;
	private String result;
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
			
			result="comment-ok";
			return SUCCESS;
		}else{
			result="comment-no";
			return ERROR;
		}
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
