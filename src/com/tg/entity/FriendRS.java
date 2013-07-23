package com.tg.entity;

import java.io.Serializable;

public class FriendRS implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String userName;
	private String friendName;
	
	/*¹¹Ôìº¯Êý*/
	public FriendRS(){
		
	}
	public FriendRS(String userName,String friendName){
		this.userName = userName;
		this.friendName = friendName;
	}
	
	/*Getters and Setters*/
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(this == obj){
			return true;
		}
		if(obj!=null && obj.getClass()==FriendRS.class){
			FriendRS target = (FriendRS)obj;
			if(target.getUserName().equals(this.getUserName()) && target.getFriendName().equals(this.getFriendName())){
				return true;
			}
		}
		return false;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return getUserName().hashCode()*5+getFriendName().hashCode();
	}
	
	
}
