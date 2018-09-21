import java.util.Scanner;

public class ProblemSet2 {
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
//
	public void sayHello() {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println("What is your name?");
		System.out.println("Hello, " + name);
		in.close();
	}
	
	public void gradeMe() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first homework grade");
		Double homework1 = in.nextDouble();
		System.out.println("Enter your second homework grade");
		Double homework2 = in.nextDouble();
		System.out.println("Enter your third homework grade");
		Double homework3 = in.nextDouble();
		
		System.out.println("Enter your first quiz grade");
		Double quiz1 = in.nextDouble();
		System.out.println("Enter your second quiz grade");
		Double quiz2 = in.nextDouble();
		System.out.println("Enter your third quiz grade");
		Double quiz3 = in.nextDouble();
		
		System.out.println("Enter your first test grade");
		Double test1 = in.nextDouble();
		System.out.println("Enter your second test grade");
		Double test2 = in.nextDouble();
		System.out.println("Enter your third test grade");
		Double test3 = in.nextDouble();
		
		double finalGrade = (((homework1+homework2+homework3)/3*.15)+ ((quiz1+quiz2+quiz3)/3*.30)+ ((test1+test2+test3)/3*.55));
		System.out.println("Final Grade = " + finalGrade);
		
		System.out.println();
		in.close();
	}
	
	public void groupUs() {
		
	}
	
	public void info() {
		
	}
	
	public void initials() {
		
	}
}