package com.test;
public class Cloth {
	private int size;
	private String color;

	public Cloth(){}
	public Cloth(int size,String color) {//利用构造方法来初始化变量
		this.size = size;//方法被哪个对象调用，this就指向那个对象。这里是实例变量size.
		this.color = color;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
}
