package com.acts.cdac;

import java.util.Scanner;

public class Program {
	private static void display(String str, int n, float f) {
		// TODO Auto-generated method stub
		System.out.printf("Method-1\n %-20s %-10d %-10.2f\n",str , n , f);
	}
	public static void display(int n, float f,String str) {
		// TODO Auto-generated method stub
		System.out.printf("Method-2\n %-20s %-10d %-10.2f\n",str , n , f);
	}
	static void display( float f,String str, int n) {
		// TODO Auto-generated method stub
		System.out.printf("Method-3\n %-20s %-10d %-10.2f",str , n , f);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Employee Name : ");
		String str = sc.nextLine();
		System.out.print("Enter Employee ID : ");
		int n = sc.nextInt();
		System.out.print("Enter Salary : ");
		float f = sc.nextFloat();
		
		display(str,n,f);
		display(n,f,str);
		display(f,str,n);

	}

	
}
