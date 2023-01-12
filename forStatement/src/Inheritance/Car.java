package Inheritance;

public class Car extends Vehicle {
	
	private int seats;
	private int seatBelts;
	private int airBags;
	
	public Car(int changingGears, int speed,int seats,int seatBelts,int airBags) {
		super(1, changingGears, speed);
		this.seats = seats;
		this.seatBelts = seatBelts;
		this.airBags = airBags;
	}
	
	

}
