package com.core;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:");
		a=sc.nextInt();
		System.out.println("Enter B:");
		b=sc.nextInt();
		System.out.println("1. addition :");
		System.out.println("2. subtraction :");
		System.out.println("3. multiplication :");
		System.err.println("4. division");
		System.out.println("Enter your coice");
		d=sc.nextInt();
		switch(d)
		{
			case 1:
				c=a+b;''
				System.out.println("addition :"+c);
				break;
			case 2:
				c=a-b;
				System.out.println("subtraction :"+c);
				break;
			case 3:
				c=a*b;
				System.out.println("multiplication :"+c);
				break;
			case 4:
				c=a/b;
				System.out.println("division :"+c);
				break;
			default:
				System.out.println("invalid coice");
				break;
				
				
		}
	}

}
