package com.practise.abstractfactory;

public class AbstractFactoryPatternDemo {
	public static void main(String[] args){
		AbstractFactory abstractFactory;
		abstractFactory = FactoryProducer.getFactory("Shape");
		Shape shape;
		shape = abstractFactory.getShape("Rectangle");
		shape.draw();
		shape = abstractFactory.getShape("Square");
		shape.draw();
		shape = abstractFactory.getShape("Circle");
		shape.draw();
		abstractFactory = FactoryProducer.getFactory("Color");
		Color color;
		color = abstractFactory.getColor("Red");
		color.fill();
		color = abstractFactory.getColor("Blue");
		color.fill();
		color = abstractFactory.getColor("Green");
		color.fill();
	}
}
