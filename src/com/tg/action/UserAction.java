package com.tg.action;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private String password;
	
	private String phone;
	private String email;
	
	private String result;
	
	public String login(){
		if(userName.equals("xubinbin")&& password.equals("111")){
			System.out.println("sss"+userName+password);
			result="success";
			return SUCCESS;
		}
		else{
			result="fail";
			return ERROR;
		}
	}
   
	public String register(){
		//调用数据库
		if(userName.equals("xxx")){
			result="success";
			return SUCCESS;
		}else{
			result="fail";
			return ERROR;
		}
	}

	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}


	

}
