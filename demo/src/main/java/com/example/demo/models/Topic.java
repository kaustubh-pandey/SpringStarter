package com.example.demo.models;

public class Topic {
	private String name;
	private int val;
	
	public Topic() {
		
	}
	public Topic(String name, int val) {
		super();
		this.name = name;
		this.val = val;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	
}
