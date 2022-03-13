package ConstructorAssign;

public class RectangleArea {
	int length;
	int width;
	public RectangleArea()
	{
		System.out.println(length+" "+width);
	}
	
	public RectangleArea(int length, int width) {
		this();
		this.length = length;
		this.width = width;
		int area=length*width;
		System.out.println("Area of the Rectangle is="+area);	
	}
	public RectangleArea(int length) {
				this.length = length;
				System.out.println("length is="+length);
	}

	public static void main(String[] args) {
		RectangleArea rectanglearea=new RectangleArea(10,5);
		RectangleArea rectanglearea2=new RectangleArea(10);
		
	}

}
