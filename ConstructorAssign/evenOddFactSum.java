package ConstructorAssign;
import java.util.*;
public class evenOddFactSum {
	int evenOdd;
	int num;
	int digit;
	
	public evenOddFactSum(int evenOdd, int num, int digit) {
		//super();
		this.evenOdd = evenOdd;
		this.num = num;
		this.digit = digit;
	}
public void evenOdd()
	{
	if(evenOdd%2==0)
		System.out.println("The no is Even no ");
	else
		System.out.println("The no is odd no");
	}
public void fact()
	{
	int fact=1;
	for(int i=1;i<=num;i++)
	{
		 fact=fact*i;
	}
	System.out.println("Factorial= "+fact);
	}
public void sum()
	{
		int sum=0;
	     while(0<digit)
	     {
	    	 sum=sum+digit%10;
	    	 digit=digit/10;
	     }
	     System.out.println("Sum of the no is="+sum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no , Factorial Required ,Sum of Digit");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		evenOddFactSum EvenOddFactSum =new evenOddFactSum(a, b, c);
		EvenOddFactSum.evenOdd();
		EvenOddFactSum.fact();
		EvenOddFactSum.sum();

	}

}
