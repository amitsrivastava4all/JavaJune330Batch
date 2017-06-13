import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = scanner.next();
		//String name = scanner.nextLine();
		System.out.println("Name is "+name);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Age is "+age);
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Salary "+salary);
		
		

	}

}
