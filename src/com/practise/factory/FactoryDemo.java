package com.practise.factory;

public class FactoryDemo {

	public static void main(String[] args){
		Shape shape = null;
		shape = ShapeFactory.getInstance("circle");
		shape.draw();
		shape = ShapeFactory.getInstance("Rectangle");
		shape.draw();
		shape = ShapeFactory.getInstance("Square");
		shape.draw();
	}
}
