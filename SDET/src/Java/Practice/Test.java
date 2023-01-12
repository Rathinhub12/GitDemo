package Java.Practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
//	   Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter Employee ID: ");
	  int empId=scanner.nextInt();
	  scanner.nextLine();
	  System.out.println("Enter Employee Name: ");
	  String empName = scanner.nextLine();
	  System.out.println("Enter Employee Salary: ");
	  int empSalary = scanner.nextInt();
	  //System.out.println(empId+empName+empSalary);
	  Employee employee = new Employee(empId, empSalary, empName);
	  String emp= employee.toString();
	  System.out.println(emp);
	  try {
		  BufferedWriter writer = new BufferedWriter(new FileWriter(".\\store.txt"));
		  writer.write(emp);
		  writer.close();
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
	  
	  
	   

	}

}
