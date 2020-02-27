package com.cx.bean;

public class Good {
	private Integer id;
	private String china;
	private String english;
	private Brand brand;
	private Type type;
	private Integer size;
	private Double price;
	private Integer mach;
	private String noter;
	private String img;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getChina() {
		return china;
	}
	public void setChina(String china) {
		this.china = china;
	}
	public String getEnglish() {
		return english;
	}
	public void setEnglish(String english) {
		this.english = english;
	}
	public Brand getBrand() {
		return brand;
	}
	public void setBrand(Brand brand) {
		this.brand = brand;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getMach() {
		return mach;
	}
	public void setMach(Integer mach) {
		this.mach = mach;
	}
	public String getNoter() {
		return noter;
	}
	public void setNoter(String noter) {
		this.noter = noter;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Good(Integer id, String china, String english, Brand brand, Type type, Integer size, Double price,
			Integer mach, String noter, String img) {
		super();
		this.id = id;
		this.china = china;
		this.english = english;
		this.brand = brand;
		this.type = type;
		this.size = size;
		this.price = price;
		this.mach = mach;
		this.noter = noter;
		this.img = img;
	}
	@Override
	public String toString() {
		return "Good [id=" + id + ", china=" + china + ", english=" + english + ", brand=" + brand + ", type=" + type
				+ ", size=" + size + ", price=" + price + ", mach=" + mach + ", noter=" + noter + ", img=" + img + "]";
	}
	public Good() {
		super();
	}
	
}
