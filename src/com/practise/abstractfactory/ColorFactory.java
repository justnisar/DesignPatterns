package com.practise.abstractfactory;

public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor(String type) {
		// TODO Auto-generated method stub
		if(type == null)
			return null;
		else if(type.equalsIgnoreCase("RED"))
			return new Red();
		else if(type.equalsIgnoreCase("BLUE"))
			return new Blue();
		else if(type.equalsIgnoreCase("GREEN"))
			return new Green();
		return null;
	}
}