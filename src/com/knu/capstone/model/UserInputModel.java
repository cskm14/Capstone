package com.knu.capstone.model;

import java.util.ArrayList;

public class UserInputModel {
	private String menu;
	private int ea;
	private ArrayList<String> unicodes = new ArrayList<String>();


	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getEa() {
		return ea;
	}
	public void setEa(int ea) {
		this.ea = ea;
	}
	public ArrayList<String> getUnicodes() {
		return unicodes;
	}
	public void setUnicodes(ArrayList<String> unicodes) {
		this.unicodes = unicodes;
	}
	public String[] getUnicodesByArray(){
		String[] returnArray = new String[this.unicodes.size()];
		for(int i=0; i<this.unicodes.size(); i++){
			returnArray[i] = this.unicodes.get(i);
		}
		return returnArray;
	}
}
