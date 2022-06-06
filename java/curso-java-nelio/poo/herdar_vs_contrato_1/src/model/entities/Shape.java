package model.entities;

import model.enums.ShapeColor;

public abstract class Shape {
	
	private ShapeColor color;

	public Shape(ShapeColor color) {
		this.color = color;
	}
	
	public abstract double area();

	public ShapeColor getColor() {
		return color;
	}

	public void setColor(ShapeColor color) {
		this.color = color;
	}
}