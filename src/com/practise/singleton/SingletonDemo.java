package com.practise.singleton;

public class SingletonDemo {
	public static void main(String[] args){
		SingleObject obj = SingleObject.getInstance();
		obj.print();
	}
}
