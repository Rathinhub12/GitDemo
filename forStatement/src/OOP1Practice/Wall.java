package OOP1Practice;

public class Wall {
	private double width;
	private double height;
	
	//Empty Constructor
	public Wall() {
		
	}
//constructor with two fields:
	public Wall(double width, double height) {
		super();
		this.width = width;
		this.height = height;
		if((this.width<0) && (this.height<0)) {
			this.width = 0;
			this.height = 0;
		}
	}
	
	//Getter & Setter:
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
	    this.width = width;
		if(this.width<0) {
			this.width = 0;
			
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
	    this.height = height;
		if(this.height<0) {
			this.height = 0;
		}
	}
	
	public double getArea() {
		return (this.width*this.height);
	} 
}