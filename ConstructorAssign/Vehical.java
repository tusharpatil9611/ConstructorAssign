package ConstructorAssign;

public class Vehical {
		String colour ="Black";
		int wheelCount=4;
		int gearCount=5;
		public Vehical()
		{
			System.out.println(colour+" "+gearCount+" "+wheelCount);
		}
	public Vehical(String colour, int gearCount) {
			this();
			this.colour = colour;
			this.gearCount = gearCount;
			System.out.println(colour+" "+gearCount+" "+wheelCount);
		}

	public static void main(String[] args) {
		Vehical vehical=new Vehical("Red",4);
	
	}

}
