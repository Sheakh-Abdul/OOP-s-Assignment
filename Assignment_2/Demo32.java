package com.acts.cdac;


import java.util.Scanner;

public class Demo32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Double value : ");
		double d = sc.nextDouble();
		
		int n = (int) d;
		System.out.println("Integer value : "+n);
		sc.close();

	}

}
