package ConstructorAssign;

public class Bank {
	int amount=5000;
	int amount1;
	
	

	public Bank()
	{
	System.out.println(amount);
	}

	public Bank(int amount1) 
	{
	this();	
		this.amount1 = amount1;
		int total=amount+amount1;
		System.out.println("TOtal amount="+total);
	}
	public static void main(String[] args) {
		Bank bank=new Bank(2000);
		

	}

}
