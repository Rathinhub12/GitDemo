package Polymorphism;

//class Movie{
//	private String name;
//
//	public Movie(String name) {
//		super();
//		this.name = name;
//	}
//	
//	public String plot() {
//		return "No Plot here";
//	}
//
//	public String getName() {
//		return name;
//	}
//	
//}
//
//class Jaws extends Movie{
//	public Jaws() {
//		super("Jaws");
//	}
//	
//	public String plot() {
//		return "A Shark eats lots of people";
//	}
//}
//
//class IndependenceDay extends Movie {
//
//	public IndependenceDay() {
//		super("Independence Day");
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	public String plot() {
//		
//		return "aliens attempt to take over earth";
//	}	
//}
//
//class MazeRunner extends Movie{
//
//	public MazeRunner() {
//		super("Maze Runner");
//		
//	}
//
//	@Override
//	public String plot() {
//		
//		return "Kids try & escape a maze" ;
//	}
//}
//
//class StarWars extends Movie{
//
//	public StarWars() {
//		super("Star Wars");
//		
//	}
//
//	@Override
//	public String plot() {
//		
//		return "Imperial Forces";
//	}
//		
//}
//
//class Forgettable extends Movie{
//
//	public Forgettable() {
//		super("Forgettable");
//		
//	}
//	
//	
//}

class Car {
	private boolean engine;
	private int cylinders;
	private String name;
	private int wheels;
	
	public Car(int cylinders, String name) {
		super();
		this.cylinders = cylinders;
		this.name = name;
		this.wheels = 4;
		this.engine = true;
	}

	public boolean isEngine() {
		return engine;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}

	public int getWheels() {
		return wheels;
	}
	
	public void startEngine() {
		System.out.println("Engine started");
	}
	public void accelerate() {
		System.out.println("Engine accelerated");
	}
	public void brake() {
		System.out.println("Braked");
	}

}


class MiniCooper extends Car{

	public MiniCooper(int cylinders, String name) {
		super(cylinders, name);
		
	}

	@Override
	public void startEngine() {
		System.out.println("Mini Cooper Engine started");
		super.startEngine();
	}

	@Override
	public void accelerate() {
		System.out.println("Mini Cooper accelerate called");
		super.accelerate();
	}
	
	
}

class BMW extends Car{

	public BMW(int cylinders, String name) {
		super(cylinders, name);
		
	}

	@Override
	public void startEngine() {
		System.out.println(" BMW Engine started");
		super.startEngine();
	}

	@Override
	public void brake() {
		System.out.println("BMW brake called");
		super.brake();
	}
	
	
}

class Audi extends Car{

	public Audi(int cylinders, String name) {
		super(cylinders, name);
		
	}

	@Override
	public void startEngine() {
		System.out.println(" Audi Engine started");
		super.startEngine();
	}

	@Override
	public void accelerate() {
		System.out.println("Audi accelerate called");
		super.accelerate();
	}

	@Override
	public void brake() {
		System.out.println("Audi brake called");
		super.brake();
	}
	
}	


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i =1;i<11;i++) {
//			
//			Movie movie = randomMovie();
//			System.out.println(i,movie.getName()+"\n"+"Plot: "+movie.plot()+"\n");
//			
//		}
		
		Car car = new Car (8,"Base Car");
		car.startEngine();
		car.accelerate();
		car.brake();
		Audi audi = new Audi(6,"Outlander");
		audi.startEngine();
		audi.accelerate();
		audi.brake();
		
		}
//	public static Movie randomMovie() {
//		 int randomNumber = (int)(Math.random()*5)+1;
//			System.out.println(randomNumber);
//		   switch (randomNumber) {
//			case 1:
//				return new Jaws();
//			case 2:
//				return new IndependenceDay();
//			case 3:
//				return new MazeRunner();
//			case 4:
//				return new StarWars();
//			case 5:
//				return new Forgettable();
//			default:
//				return null;
//		}
//
//}

}
