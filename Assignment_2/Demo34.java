package com.acts.cdac;
import java.util.*;

public class Demo34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Integer Value = ");
		int n = sc.nextInt();
		double d = n;
		float f = n;
		boolean b;
		if (n>0)
			b= true;
		else
			b= false;
		String str = String.valueOf(n);
		System.out.println("Double = "+d);
		System.out.println("Float = "+f);
		System.out.println("Boolean = "+b);
		System.out.println("String = "+str);
		sc.close();

	}

}
