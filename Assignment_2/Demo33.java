package com.acts.cdac;

import java.util.Scanner;

public class Demo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float f;
		double d;
		int n;
		System.out.print("Enter a Double value : ");
		d = sc.nextDouble();
		
		n = (int) d;
		System.out.println("Integer value : "+n);
		f = (float) d;
		System.out.println("Float value : "+f);
		
		System.out.print("\nEnter a Integer value : ");
		n = sc.nextInt();
		
		double d1 = n;
		System.out.println("Double value : "+d1);
		
		f= n;
		System.out.println("Float value : "+f);
		
		System.out.print("\nEnter a Float value : ");
		f = sc.nextFloat();
		n= (int) f;
		System.out.println("Integer value : "+n);
		d=f;
		System.out.println("Double value : "+d);
		
		
		
		sc.close();

	}

}
