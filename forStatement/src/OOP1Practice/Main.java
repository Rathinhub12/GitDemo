package OOP1Practice;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Carpet carpet = new Carpet(3.5);
//		Floor floor = new Floor(2.75, 4.0);
//		Calculator calculator = new Calculator(floor, carpet);
//		System.out.println("total= " + calculator.getTotalCost());
//		carpet = new Carpet(1.5);
//		floor = new Floor(5.4, 4.5);
//		calculator = new Calculator(floor, carpet);
//		System.out.println("total= " + calculator.getTotalCost());
		
//		ComplexNumber one = new ComplexNumber(1.0, 1.0);
//		ComplexNumber number = new ComplexNumber(2.5, -1.5);
//		one.add(1,1);
//		System.out.println("one.real= " + one.getReal());
//		System.out.println("one.imaginary= " + one.getImaginary());
//	    one.substract(number);
//		System.out.println("one.real= " + one.getReal());
//		System.out.println("one.imaginary= " + one.getImaginary());
//		number.substract(one);
//		System.out.println("number.real= " + number.getReal());
//		System.out.println("number.imaginary= " + number.getImaginary());
		
		
		Circle circle = new Circle(3.75);
		System.out.println("circle.radius= " + circle.getRadius());
		System.out.println("circle.area= " + circle.getArea());
		Cylinder cylinder = new Cylinder(5.55, 7.25);
		System.out.println("cylinder.radius= " + cylinder.getRadius());
		System.out.println("cylinder.height= " + cylinder.getHeight());
		System.out.println("cylinder.area= " + cylinder.getArea());
		System.out.println("cylinder.volume= " + cylinder.getVolume());

	}

}
