package model.entities;

import model.enums.ShapeColor;

public class Circle extends AbstractShape {
	
	private Double radius;

	public Circle(ShapeColor color, Double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
}