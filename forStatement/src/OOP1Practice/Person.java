package OOP1Practice;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	//getter and setter
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setSecondName(String LastName) {
		this.lastName = LastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if((age<0)||(age>100)) {
		this.age = 0;
	}else {
		this.age = age;
	}
	}
    public boolean isTeen() {
    	if((this.age>12)&&(this.age<20)) {
    		return true;
    	}else {
    		return false;
    	}
    }
   public String getFullName() {
	   if((this.firstName == "")&&(this.lastName == "")) {
            return "";		   
	   }else if(this.lastName == "") {
		   return this.firstName;
	   }else if(this.firstName == "") {
		   return this.lastName;
	   }else {
		   return (this.firstName + this.lastName);
	   }
	   
   }
}
