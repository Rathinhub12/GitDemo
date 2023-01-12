package Java.Practice;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Vaishali {

	

	
		private static Scanner scanner =  new Scanner(System.in);
		
		public static void main(String[] args) {
			System.out.println("Enter Employee ID");
			int empId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter Employee Name");
			String empName = scanner.nextLine();
			System.out.println("Enter Employee Salary");
			int empSalary = scanner.nextInt();

			System.out.println("ID is: " +empId +"\n"+
					"name is : "+empName+"\n"+
					"Salary is: "+empSalary);
			
			Employee myemp = new Employee(empId, empSalary, empName);
			String emp = myemp.toString();
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(".\\Store1.txt"));
				writer.write(emp);
				writer.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

