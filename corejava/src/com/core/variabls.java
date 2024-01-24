package com.core;

import java.util.Scanner;

public class variabls {
	public static void main(String[] arg) {
		int a,b,c;
		Scanner sc=new Scanner(System.in); 
		System.out.print("enter a:");
		a=sc.nextInt();
		
		System.out.print("enter b:");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition :"+c);
		c=a-b;
		System.out.println("Subtrection :"+c);
		c=a*b;
		System.out.println("Multiplication :"+c);
		c=a/b;
		System.out.println("Division :"+c);
	}

}
