package com.cx.bean;

public class Dats {
	private Integer pagenum;
	private Integer tid;
	private Integer bid;
	private Double price1;
	private Double price2;
	private String goodname;
	public Integer getPagenum() {
		return pagenum;
	}
	public void setPagenum(Integer pagenum) {
		this.pagenum = pagenum;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public Double getPrice1() {
		return price1;
	}
	public void setPrice1(Double price1) {
		this.price1 = price1;
	}
	public Double getPrice2() {
		return price2;
	}
	public void setPrice2(Double price2) {
		this.price2 = price2;
	}
	public String getGoodname() {
		return goodname;
	}
	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}
	@Override
	public String toString() {
		return "Dats [pagenum=" + pagenum + ", tid=" + tid + ", bid=" + bid + ", price1=" + price1 + ", price2="
				+ price2 + ", goodname=" + goodname + "]";
	}
	public Dats(Integer pagenum, Integer tid, Integer bid, Double price1, Double price2, String goodname) {
		super();
		this.pagenum = pagenum;
		this.tid = tid;
		this.bid = bid;
		this.price1 = price1;
		this.price2 = price2;
		this.goodname = goodname;
	}
	public Dats() {
		super();
	}
	
}
