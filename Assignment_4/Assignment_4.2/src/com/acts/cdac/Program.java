package com.acts.cdac;

import java.util.Scanner;


class Vehicle{
	int k;

	  void display(String name, int n) {
		 System.out.println("\nVehicle Name : "+name);
		 System.out.println("Modal Year : "+n);
		
	}
	  void display(int n, String name, int m) {
		 System.out.println("Vehicle Name : "+name);
		 System.out.println("Modal Year : "+n);
		 System.out.println("Vehicle price : "+m);
		
	}
	
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vi = new Vehicle();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Vehicle Name : ");
		String name = sc.nextLine();
		System.out.print("Enter Modal Year : ");
		int n = sc.nextInt();
		System.out.print("Enter price : ");
		int p = sc.nextInt();
		
		vi.display(name,n);
		System.out.println("-------------OVER-LOADING-----------------");
		vi.display(n,name,p);
		

	}

}
