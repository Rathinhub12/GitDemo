package Inheritance;

public class Vehicle {
	private int steering;
	private int changingGears;
	private int speed;
	
	public Vehicle(int steering, int changingGears, int speed) {
		super();
		this.steering = steering;
		this.changingGears = changingGears;
		this.speed = speed;
	}

	public void mirror() {
		System.out.println("2 mirrors are available");
	}
	
	public int getSteering() {
		return steering;
	}

	public int getChangingGears() {
		return changingGears;
	}

	public int getSpeed() {
		return speed;
	}
	
	

}
