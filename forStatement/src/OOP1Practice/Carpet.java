package OOP1Practice;

public class Carpet {
	private double cost;

	public Carpet(double cost) {
		super();
		if(cost<0) {
		this.cost = 0;
	   }else {
		   this.cost = cost;
	   }
	}
	public double getCost() {
		return this.cost;
	}
}	
