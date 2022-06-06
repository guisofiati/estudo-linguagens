package model.entities;

import model.enums.ShapeColor;

public abstract class AbstractShape implements Shape {
		
	private ShapeColor color;
	
	public AbstractShape(ShapeColor color) {
		this.color = color;
	}

	public ShapeColor getColor() {
		return color;
	}

	public void setColor(ShapeColor color) {
		this.color = color;
	}
}