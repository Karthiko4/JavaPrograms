package karthik;
import java.util.*;

public class overloading {
	
public double area(double base, double height) 
{
	return 0.5*base*height;
}
public double area(double length,int width) 
{
	return length*width;
	
}
public double area(int radius) 
{
	return 3.14*radius*radius;
}


	public static void main(String[] arg) {
		
	Scanner sc=new Scanner(System.in);
	overloading tri=new overloading();
	overloading rec=new overloading();
	overloading cir=new overloading();
	System.out.println("Enter the base and height of the triangle:");
	double base=sc.nextInt();
	double height=sc.nextInt();
	System.out.println("Enter the width and lenght of the rectangle:");
	int width=sc.nextInt();
	int lenght=sc.nextInt();
	System.out.println("Enter the radius of the circle:");
	int radius=sc.nextInt();
	double trianglurearea=tri.area(base,height);
	double rectanglearea=rec.area(width,lenght);
	double circlearea=cir.area(radius);
	
	System.out.println("Area of the Triangle is "+ trianglurearea);
	System.out.println("Area of the Rectangle is "+ rectanglearea);
	System.out.println("Area of the circle is "+ circlearea);
	
	
		
		
		
	}

}
