package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double finalGrade() {
		return grade1 + grade2 + grade3;
	}
	
	public void statusStudent() {
		
		if (finalGrade() >= 60.0) {
			System.out.println("PASS");
		}
		else {
			double missingPoints = 60.0 - finalGrade();
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS\n", missingPoints);
		}
	}
}