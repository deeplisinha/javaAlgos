package com.arrays;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		int num=sr.nextInt();
		sr.close();
		int temp=num;
		int rev=0;
		while(num>0) {
			int last=num%10;
			rev=(rev*10)+last;
			 num=num/10;
		}
		if(temp==rev) {
			System.out.println(temp+":"+"is palindrome");
	}
		else {
			
			System.out.println(temp+":"+"is not palindrome");
		}
}
}
