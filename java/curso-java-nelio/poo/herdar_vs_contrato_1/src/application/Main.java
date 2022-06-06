package application;

import java.util.Locale;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;
import model.enums.ShapeColor;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Shape shape1 = new Circle(ShapeColor.BLACK, 2.0);
		Shape shape2 = new Rectangle(ShapeColor.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: " + shape1.getColor());
		System.out.println("Circle area: " + String.format("%.2f", shape1.area()));
		System.out.println("Rectangle color: " + shape2.getColor());
		System.out.println("Rectangle area: " + String.format("%.2f", shape2.area()));
	}
}