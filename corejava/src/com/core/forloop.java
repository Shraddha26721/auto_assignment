package com.core;

import java.util.Scanner;

public class forloop {
	public static void main(String[] args) {
		int i,total=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n :");
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			total=total+1;
			System.out.println("total:"+total);
		}
		System.out.println("Total :"+total);
	}

}
