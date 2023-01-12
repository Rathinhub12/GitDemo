package Java.Practice;

public class Employee {
    private int empID;
    private int empSalary;
    private String empName;
    
 //Constructor
    
	public Employee(int empID, int empSalary, String empName) {
		super();
		this.empID = empID;
		this.empSalary = empSalary;
		this.empName = empName;
	}
//Override toString() method;

	@Override
	public String toString() {
		return "Id is: " +empID +"\n"+"name is :"+empName+"\n"+"Salary is:"+empSalary ;
				
				
	}
	
	}
	
	

