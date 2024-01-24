package com.core;

import java.util.Scanner;

public class Ifcondition {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc=new Scanner(System.in );
		System.out.print("enter a:");
		a=sc.nextInt();
		System.out.print("enter b:");
		b=sc.nextInt();
		System.out.print("enter c:");
		c=sc.nextInt();
		if (a>b)
		{
			if(a>c)
			{
			System.out.println("a is max number");
			}
			else
			{
				System.out.println("c is max number");
			}
		}
		else if(b>c)
		{
			System.out.println("b is max number");
		}
		else
		{
			System.out.println("c is max number");
		}
		
	}

}
