package ConstructorAssign;
import java.util.*;
public class Rectangle {
	int length;
	int width;

	public Rectangle(int length, int width) {
		//super();
		this.length = length;
		this.width = width;
	}
public int area()
{
	int A=(length*width);
	return A;
}
public int peri()
{
int p=2*(length+width);
return p;
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and width if the Triangle");
		int l=sc.nextInt();
		int w=sc.nextInt();
		Rectangle rectangle=new Rectangle(l,w);
		int Area=rectangle.area();
		System.out.println("Area of the Rectangle is="+Area);
		int peri=rectangle.peri();
		System.out.println("Perimeter of the rectagle is="+peri);
	}

}
