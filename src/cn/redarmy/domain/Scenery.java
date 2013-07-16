package cn.redarmy.domain;

public class Scenery {
	
	private String viewNo;           //景点编号
	private String name;             //景点名称
	private int number;              //景点评价人数
	private int score;               //评价均分
	
	/*聚类分析*/	
	private int nature;
	private int humanLandscape;
	private int folkCultrue;
	private int catering;
	private int historyCultrue;
	private int literatureArt;
	private int countryside;
	private int urbanModern;
	
	//Getters and Setters
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
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
