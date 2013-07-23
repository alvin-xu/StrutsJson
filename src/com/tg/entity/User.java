package com.tg.entity;

public class User {

	private String userName;      //用户名
	private String password;      //密码
	private String email;         //邮箱
	private String telephone;     //手机号
	
	/*聚类分析*/	
	private float nature;
	private float carve;
	private float archetecture;
	private float music;
	private float historyCulture;
	private float entertainment;
	private float catering;
	
	/*Getters and Setters*/
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public float getNature() {
		return nature;
	}
	public void setNature(float nature) {
		this.nature = nature;
	}
	public float getCarve() {
		return carve;
	}
	public void setCarve(float carve) {
		this.carve = carve;
	}
	public float getArchetecture() {
		return archetecture;
	}
	public void setArchetecture(float archetecture) {
		this.archetecture = archetecture;
	}
	public float getMusic() {
		return music;
	}
	public void setMusic(float music) {
		this.music = music;
	}
	public float getHistoryCulture() {
		return historyCulture;
	}
	public void setHistoryCulture(float historyCulture) {
		this.historyCulture = historyCulture;
	}
	public float getEntertainment() {
		return entertainment;
	}
	public void setEntertainment(float entertainment) {
		this.entertainment = entertainment;
	}
	public float getCatering() {
		return catering;
	}
	public void setCatering(float catering) {
		this.catering = catering;
	}	
}
