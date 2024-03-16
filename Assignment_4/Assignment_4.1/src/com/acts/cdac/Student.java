package com.acts.cdac;

import java.util.Scanner;

public class Student {
	public String name;
	public int rollNo;
	public float marks;
	
	void record() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Student Name : ");
		name = sc.nextLine();
		System.out.println("Enter Student Roll No : ");
		rollNo = sc.nextInt();
		System.out.println("Enter Student Marks : ");
		marks = sc.nextFloat();
		
	}
	
	void display() {
		
		System.out.printf("\n%-15s %-10d %-10.2f",name ,rollNo,marks);
		
	}

}


