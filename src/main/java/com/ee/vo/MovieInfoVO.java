package com.ee.vo;

public class MovieInfoVO {
	private int miNum;
	private String miTitle;
	private String miDesc;
	public int getMiNum() {
		return miNum;
	}
	public void setMiNum(int miNum) {
		this.miNum = miNum;
	}
	public String getMiTitle() {
		return miTitle;
	}
	public void setMiTitle(String miTitle) {
		this.miTitle = miTitle;
	}
	public String getMiDesc() {
		return miDesc;
	}
	public void setMiDesc(String miDesc) {
		this.miDesc = miDesc;
	}
	@Override
	public String toString() {
		return "MovieInfoVO [miNum=" + miNum + ", miTitle=" + miTitle + ", miDesc=" + miDesc + "]";
	}
	
	
}
