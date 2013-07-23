package com.tg.action;

import com.opensymphony.xwork2.Action;

public class MessageAction implements Action{

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("message:"+message);
		return SUCCESS;
	}

}
