package com.knu.capstone.model;

import java.util.ArrayList;

public class MenuModel {
	private int id;
	private String name;
	private int price;
	private ArrayList<String> unicodes = new ArrayList<String>();


	public MenuModel(int id, String name, int price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public ArrayList<String> getUnicodes() {
		return unicodes;
	}
	public void setUnicodes(ArrayList<String> unicodes) {
		this.unicodes = unicodes;
	}

}
