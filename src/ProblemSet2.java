import java.util.Scanner;

public class ProblemSet2 {
	static Scanner in = new Scanner(System.in);
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
		in.close();
	}
	public void sayHello() {
		System.out.println("What is your name?");
		String name = in.nextLine();
		System.out.println("Hello, " + name);
	}
	
	public void gradeMe() {
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
		
		double finalGrade = ((((homework1+homework2+homework3)/3)*.15)+ (((quiz1+quiz2+quiz3)/3)*.30)+ (((test1+test2+test3)/3)*.55));
		System.out.print("Final Grade = ");
		System.out.format("%.2f", finalGrade);
		System.out.print("%");

		System.out.println();
		in.nextLine();
	}
	
	public void groupUs() {
		System.out.println("How many students will be traveling?");
		int students = in.nextInt();
		if (students <= 0)
			System.out.println("You can't have a negative number of people on a bus!");
		System.out.println("How many teachers will be traveling?");
		int teachers = in.nextInt();
		int total_persons = students + teachers;
		int busses = total_persons / 47;
		int remainder = total_persons - (47*busses);
		if (total_persons % 47 == 0) {
			System.out.println("You will have " + busses + " busses with 47 people each");
		} else {
			System.out.println("You will have " + (busses+1) + " busses with all buses full except the last bus which will have " + remainder +  " people on it.");
		}
		in.nextLine();
	}
	
	public void info() {
		System.out.println("What is your first name?");
		String first_name = in.nextLine();
		System.out.println("What is your last name?");
		String last_name = in.nextLine();
		System.out.print("What is your numerical grade level?\n");
		int grade = in.nextInt();
		System.out.print("How old are you in calendar years?\n");
		int age = in.nextInt();
		System.out.print("How is the name of your home_town spelled?\n");
		in.nextLine();
		String home_town = in.nextLine();
		System.out.println("NAME     : " + first_name + " " + last_name); 
		System.out.println("GRADE    : " + grade);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + home_town);
	}
	
	public void initials() {
		System.out.println("Please enter your first name: ");
		String first_name = in.nextLine().toUpperCase();
		System.out.println("Please enter your middle name");
		String middle_name = in.nextLine().toUpperCase();
		System.out.println("Please enter your last name: ");
		String last_name = in.nextLine().toUpperCase();
		
		System.out.println("Your initials are " + (first_name.charAt(0)) + (middle_name.charAt(0)) + (last_name.charAt(0)));
	}
}



