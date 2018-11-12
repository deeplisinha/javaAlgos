package com.arrays;

import java.util.Scanner;

public class FibSeries1 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int fib1=0;
		int fib2=1;
		int i=0;
		while(fib2<=n) {
			int fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.println(fib2+"");
				i++;

			}

	}

}
