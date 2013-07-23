package com.tg.entity;

public class Scenery {

	private String viewNo;
	private String name;
	private String address;
	private String description;
	private float playTime;            //建议游玩时间 min
	private String businessHour;       //开放时间
	private String traffic;
	private String ticket;
	private String bestHour;           //最佳旅游时节
	private int evalNum;               //评价人数
	private float score;               //评价均分
	
	private float efficacy = 0;
	
	/*Getters and Setters*/
	public String getViewNo() {
		return viewNo;
	}
	public void setViewNo(String viewNo) {
		this.viewNo = viewNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPlayTime() {
		return playTime;
	}
	public void setPlayTime(float playTime) {
		this.playTime = playTime;
	}
	public String getBusinessHour() {
		return businessHour;
	}
	public void setBusinessHour(String businessHour) {
		this.businessHour = businessHour;
	}
	public String getTraffic() {
		return traffic;
	}
	public void setTraffic(String traffic) {
		this.traffic = traffic;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public String getBestHour() {
		return bestHour;
	}
	public void setBestHour(String bestHour) {
		this.bestHour = bestHour;
	}
	public int getEvalNum() {
		return evalNum;
	}
	public void setEvalNum(int evalNum) {
		this.evalNum = evalNum;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public float getEfficacy() {
		return efficacy;
	}
	public void setEfficacy(float efficacy) {
		this.efficacy = efficacy;
	}
}
