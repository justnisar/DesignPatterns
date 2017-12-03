package com.practise.observer;

public class BinaryObserver extends Observer{
	
	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}
	
	public void update(){
		System.out.println("The binary observer status : " + Integer.toBinaryString(subject.getState()));
	}
}