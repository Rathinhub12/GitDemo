package AutoboxingInboxing;

public class MainAutoboxingChallange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank =new Bank("National Australia Bank");
		
		bank.addBranch("Adelaide");
		
		bank.addCustomer("Adelaide", "Rathin", 50.05);
		bank.addCustomer("Adelaide", "Vaishali", 175.34);
		bank.addCustomer("Adelaide", "Galaxy", 220.12);
		
		bank.addBranch("Sydney");
		bank.addCustomer("Sydney", "SmartCity", 150.54);
		
		bank.addCustomerTransaction("Adelaide", "Rathin", 44.22);
		bank.addCustomerTransaction("Adelaide", "Rathin", 12.44);
		bank.addCustomerTransaction("Adelaide", "Vaishali", 50.05);
		
		bank.listCustomers("Adelaide", true);
		bank.listCustomers("Sydney", true);
		
		
		if(!bank.addCustomer("Melbourne", "Brian", 5.56)) {
			System.out.println("Branch does not exists");
		}
		
		if(!bank.addBranch("Adelaide")) {
			System.out.println("branch already exists");
		}
		
		
		

	}

}
