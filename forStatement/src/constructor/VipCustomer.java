package constructor;

public class VipCustomer {
	
	private String name;
	private double crditLimit;
	private String email;
	
	//Constructors creation
	
	public VipCustomer() {
		
		this("mundodas",1200.00,"mund@casa.com");
		
		System.out.println("Empty Constructor created");
	}
	
	public VipCustomer(String name,double creditLimit) {
		this(name,creditLimit,"mund@casa.com");
		System.out.println("Constructor created with two parameter");
	}
	
	public VipCustomer(String name, double crditLimit, String email) {
		super();
		System.out.println("Constructor created with three parameter");
		this.name = name;
		this.crditLimit = crditLimit;
		this.email = email;
	}

	//Getter methods
	public String getName() {
		return name;
	}
	public double getCrditLimit() {
		return crditLimit;
	}
	public String getEmail() {
		return email;
	}
	
	

}
