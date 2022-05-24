package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.ShapeColor;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int N = sc.nextInt();
		System.out.println();
		
		for (int i=1; i<=N; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (R/C)? ");
			char answer = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			ShapeColor color = ShapeColor.valueOf(sc.next());
			
			if (answer == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				shapes.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				shapes.add(new Circle(color, radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}
}