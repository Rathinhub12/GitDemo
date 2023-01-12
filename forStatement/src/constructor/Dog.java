package constructor;

public class Dog extends Animal {
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight,int eyes,int legs,int tail,int teeth,String coat) {
		
	
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
		
	}
	private void chew() {
		System.out.println("chew");
		
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("dog.eat");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("dog.walk");
		super.move(5);
		
	}
	
	public void movelegs(int speed) {
		System.out.println("dog.movelegs called");
	}
	@Override
	public void move(int speed) {
		// TODO Auto-generated method stub
		System.out.println("dog.move");
		movelegs(speed);
		super.move(speed);
	}
	public void run() {
		System.out.println("dog.run");
		move(10);
	}

}
