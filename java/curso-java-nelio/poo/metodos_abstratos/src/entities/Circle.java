package entities;

import entities.enums.ShapeColor;

public class Circle extends Shape {
	
	private Double radius;
	
	public Circle() {
		super();
	}
	
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