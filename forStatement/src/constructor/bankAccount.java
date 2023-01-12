package constructor;

public class bankAccount {
	private String accountNumbner;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNo;
	
	//constructor creation:
	
	public bankAccount() {
		this("12345",20.0,"bebidas","bebi@mundo.com","12345");
		
	}
	
	public bankAccount(String accountNumbner,double balance,String customerName,String email,String phoneNo) {
		this.accountNumbner = accountNumbner;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	
	
	public String getAccountNumbner() {
		return accountNumbner;
	}
	public void setAccountNumbner(String accountNumbner) {
		this.accountNumbner = accountNumbner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
   
	//Two Additional methods:
	
	public void depositFunds(double depositAmount) {
		this.balance += depositAmount;
		System.out.println(this.balance+" is the updated amount");
	}
	
	public void withdrawFunds(double withdrawAmount) {
		if(withdrawAmount<balance) {
			this.balance -= withdrawAmount;
			System.out.println(this.balance+" is available for withdraw");
			
	}else {
		System.out.println("Insufficient Fund");
	}
}
}
