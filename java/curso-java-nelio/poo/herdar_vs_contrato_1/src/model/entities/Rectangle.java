package model.entities;

import model.enums.ShapeColor;

public class Rectangle extends Shape {

	private Double width;
	private Double height;
	
	public Rectangle(ShapeColor color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
}