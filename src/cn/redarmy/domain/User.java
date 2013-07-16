package cn.redarmy.domain;

public class User {

	private String userName;      //用户名
	private String password;      //密码
	private String email;         //邮箱
	private String telephone;     //手机号
	
	/*聚类分析*/	
	private int nature;
	private int humanLandscape;
	private int folkCultrue;
	private int catering;
	private int historyCultrue;
	private int literatureArt;
	private int countryside;
	private int urbanModern;
	
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
	public int getNature() {
		return nature;
	}
	public void setNature(int nature) {
		this.nature = nature;
	}
	
	public int getHumanLandscape() {
		return humanLandscape;
	}
	public void setHumanLandscape(int humanLandscape) {
		this.humanLandscape = humanLandscape;
	}
	public int getFolkCultrue() {
		return folkCultrue;
	}
	public void setFolkCultrue(int folkCultrue) {
		this.folkCultrue = folkCultrue;
	}
	public int getCatering() {
		return catering;
	}
	public void setCatering(int catering) {
		this.catering = catering;
	}
	public int getHistoryCultrue() {
		return historyCultrue;
	}
	public void setHistoryCultrue(int historyCultrue) {
		this.historyCultrue = historyCultrue;
	}
	public int getLiteratureArt() {
		return literatureArt;
	}
	public void setLiteratureArt(int literatureArt) {
		this.literatureArt = literatureArt;
	}
	public int getCountryside() {
		return countryside;
	}
	public void setCountryside(int countryside) {
		this.countryside = countryside;
	}
	public int getUrbanModern() {
		return urbanModern;
	}
	public void setUrbanModern(int urbanModern) {
		this.urbanModern = urbanModern;
	}
}
