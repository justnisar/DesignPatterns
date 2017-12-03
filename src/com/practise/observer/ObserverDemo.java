package com.practise.observer;

public class ObserverDemo {
	public static void main(String[] args){
		Subject subject = new Subject();
		BinaryObserver binaryObserver = new BinaryObserver(subject);
		OctalObserver octalObserver = new OctalObserver(subject);
		HexObserver hexObserver = new HexObserver(subject);
		subject.setState(20);
		subject.setState(40);
	}
}
