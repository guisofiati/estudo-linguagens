package application;

import boardgame.Position;

public class Main {

	public static void main(String[] args) {
		
		Position position = new Position(3, 5);
		System.out.println(position);
		position.setValues(8, 3);
		System.out.println(position);
	}
}