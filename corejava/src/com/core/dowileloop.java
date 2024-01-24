package com.core;

import java.util.Scanner;

public class dowileloop {
	public static void main(String[] args) {
		int i,total=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number :");
		i=sc.nextInt();
		do 
		{
			
			total=total+i;
			
			i--;
		}while(i>0);
		System.out.println("total="+total);
	}


}
