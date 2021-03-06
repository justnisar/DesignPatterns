package com.practise.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	List<Observer> observers;
	private int state;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	public Subject(){
		observers = new ArrayList<Observer>();
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void notifyAllObservers(){
		for(Observer observer : observers){
			observer.update();
		}
	}
	
	
}
