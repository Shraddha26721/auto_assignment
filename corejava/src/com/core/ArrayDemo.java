package com.core;

import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[]=new int[5];
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Element");
		for(i=0;i<a.length;i++)
		{
			System.out.println("Enter "+i+" Element : ");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("sum : "+sum);
		System.out.println("Array Elements are");
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
	}

}
