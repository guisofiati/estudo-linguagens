package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full path file: ");
		String path = sc.nextLine();
		
		Map<String, Integer> candidates = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String candidateName = fields[0];
				Integer candidateVotes = Integer.parseInt(fields[1]);
				
				if (candidates.containsKey(candidateName)) {
					// get espera um argumento chave
					Integer votesSoFar = candidates.get(candidateName);
					candidates.put(candidateName, votesSoFar + candidateVotes);
				}
				else {
					candidates.put(candidateName, candidateVotes);
				}
				
				line = br.readLine();
			}
			
			System.out.println();
			System.out.println("TOTAL VOTES:");
			for (Object x : candidates.keySet()) {
				System.out.println(x + ": " + candidates.get(x));
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
}