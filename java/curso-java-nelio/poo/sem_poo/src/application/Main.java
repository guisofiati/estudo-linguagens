package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double aX, bX, cX, aY, bY, cY, areaX, areaY, p;
		
		System.out.println("Enter the measures of triangle X:");
		aX = sc.nextDouble();
		bX = sc.nextDouble();
		cX = sc.nextDouble();
		System.out.println("Enter the measures of triangle Y:");
		aY = sc.nextDouble();
		bY = sc.nextDouble();
		cY = sc.nextDouble();
		
		p = (aX + bX + cX) / 2.0;
		
		areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));
		
		p = (aY + bY + cY) / 2.0;
		
		areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));
		
		System.out.printf("Triangle X area: %.4f\n", areaX);
		System.out.printf("Triangle Y area: %.4f\n", areaY);
		
		String higher = (areaX > areaY) ? "Larger area: X" : "Larger area: Y"; 
		
		System.out.println(higher);
		
		sc.close();
	}
}