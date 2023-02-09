
public class Circle extends Shape{
	private double radius;
	
	public Circle(double radius,String color) {
		super(color);
		this.radius=radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	@Override
	public double getArea() {
		return Math.PI*Math.pow(getRadius(), 2);
	}
	
	public String toString() {
		return "radius="+getRadius();
	}

}
