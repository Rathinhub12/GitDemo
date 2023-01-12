package Inheritance;

public class Audi extends Car {
	
	private int convertable;
	private int lights;

	public Audi(int changingGears, int speed, int airBags,int convertable,int lights) {
		super(changingGears, speed, 8, 8, airBags);
		this.convertable = convertable;
		this.lights = lights;
	}
	

}
