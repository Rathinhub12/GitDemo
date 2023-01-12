package forStatement;
import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your yearOfBirth:");
		int yearOfBirth = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter your Name:");
		String name = scanner.nextLine();
		int age = 2020 -yearOfBirth;
		
		System.out.println(name+age);

	}

}
