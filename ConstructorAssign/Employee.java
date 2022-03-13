package ConstructorAssign;

import java.util.Scanner;

public class Employee {
	int id;
	String name;
	int salary;
	int year;
	public Employee()
	{
		System.out.println(id+" "+name+" "+salary);
	}
	
	public Employee(int id, String name, int salary,int year) {
		//super();
		this();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int calculateSalary(int salary ,int year)
	{
		
		int sum;
		if(5<year)
		{	
		salary=2*salary;
		}
		return salary;	
	}
		
	public void employeeData()
	{
		System.out.println("employee id ="+id+", Employee Salary="+salary+", Employee Name="+name);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id , name ,year of exp and salary");
		int id=sc.nextInt();
		String name=sc.next();
		int sal=sc.nextInt();
		int year=sc.nextInt();
		Employee employee=new Employee(id,name,sal,year);
		int result =employee.calculateSalary(year, sal);
		System.out.println("Salary is="+result);
		employee.employeeData();
		
	}

}
