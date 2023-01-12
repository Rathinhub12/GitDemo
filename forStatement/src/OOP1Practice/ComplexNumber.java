package OOP1Practice;

public class ComplexNumber {
	private double real;
	private double imaginary;
	
	
	public ComplexNumber(double real, double imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}


	public double getReal() {
		return real;
	}


	public double getImaginary() {
		return imaginary;
	}
	
    public void add(double real,double imaginary) {
       this.real +=real;
       this.imaginary +=imaginary;
    }
    
   public void add(ComplexNumber ComplexNumber) {
    this.real += ComplexNumber.getReal();
    this.imaginary += ComplexNumber.getImaginary();
    }
    
    public void substract(double real,double imaginary) {
    	this.real -=real;
    	this.imaginary -=imaginary;
    }
    public void substract(ComplexNumber ComplexNumber) {
    	this.real-= ComplexNumber.getReal();
    	this.imaginary -= ComplexNumber.getImaginary();
    }
}
