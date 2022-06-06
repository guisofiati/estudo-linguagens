package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		String path = "C:\\Users\\gui_s\\Documents\\utils\\docs\\names.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String names = br.readLine();
			while (names != null) {
				list.add(names);
				names = br.readLine();
			}
			Collections.sort(list);
			for (String name : list) {
				System.out.println(name);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}