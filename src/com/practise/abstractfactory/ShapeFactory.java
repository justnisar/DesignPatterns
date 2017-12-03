package com.practise.abstractfactory;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String type) {
		// TODO Auto-generated method stub
		if(type == null)
			return null;
		else if(type.equalsIgnoreCase("CIRCLE"))
			return new Circle();
		else if(type.equalsIgnoreCase("RECTANGLE"))
			return new Rectangle();
		else if(type.equalsIgnoreCase("SQUARE"))
			return new Square();
		return null;
	}

	@Override
	public Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}
