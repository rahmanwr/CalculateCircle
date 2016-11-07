
import java.util.Scanner;        

public class CalculateCircle {
   
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	 double radius = 0.0;
    	System.out.println(" Welcome to Circle Tester" ); 
        System.out.print("Enter radius: " );
        radius = scanner.nextInt();
        double area = 0.0;
        double circumference= 0;
      
   //   area = Math.PI * radius * radius;
   //   double circumference= Math.PI * 2*radius;
        Circle crl = new Circle(radius);
        double circume = crl.getCircumferecne();
        area = crl.getArea();
        circumference = crl.getCircumferecne();
    //    String format =crl.getFormattedArea();
        
      System.out.println("Radius  " + radius);
      System.out.println("Area of circle:"+area);
      System.out.println( "The circumference of the circle is:" +circumference);
    }  
}

