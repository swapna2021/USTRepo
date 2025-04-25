package com.ust;

public class Main {

	public static void main(String[] args) {
		
		Employee e1=new Employee();//default constructor
		System.out.println(e1);
		System.out.println(e1.geteName());
		
		Employee e2=new Employee(123,"swapna",43,"Trainer",50000,"swapna.motupally@gmail.com","6281614948","hyderabad","CSE");
		
		System.out.println(e2);
		e1=e2;
		
		Employee e3 =new Employee(123,"swapna",43,"Trainer",50000,"swapna.motupally@gmail.com","6281614948","hyderabad","CSE");
		System.out.println(e3);
		System.out.println(e3.calculateSalary(60000));
		
		
		long size=ObjectSizeCalculator.getObjectSize(e1);
		System.out.println(size);
		
		
		size=ObjectSizeCalculator.getObjectSize(e2);
		System.out.println(size);
		
		size=ObjectSizeCalculator.getObjectSize(e3);
		System.out.println(size);
	}

}
