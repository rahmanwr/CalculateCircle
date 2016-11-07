
public class Circle {
	double radius;

	public double getCircumferecne() {
		double circumference= Math.PI * 2*radius;
		return circumference;
	
	}
	
//	public String getFormattedCircumference(){
		
//	}
	
	public double getArea() {
		
		double area = Math.PI * radius * radius;
		return area;
	}
	
//	public String getFormattedArea() {
		
		
//	}
	
//	private String formatNUmber(double x){
		
//	}
	
	public Circle(double radius){
		this.radius = radius;
		
		}
}

