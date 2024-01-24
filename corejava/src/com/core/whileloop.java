package com.core;

import java.util.Scanner;

public class whileloop {
	public static void main(String[] args) {
		int i,total=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		i=sc.nextInt();
		while(i>0)
		{
			
			total=total+i;
			
			i--;
		}
		System.out.println("total="+total);
	}

}
