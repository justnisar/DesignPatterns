package com.practise.singleton;

public class SingleObject {
	private static SingleObject obj = new SingleObject();
	private SingleObject(){
		
	}
	public static SingleObject getInstance(){
		return obj;
	}
	public void print(){
		System.out.println("This is the print method in SingleObject class");
	}
}
