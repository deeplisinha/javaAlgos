package com.arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		int[]arr= {2,3,5,6,7};
		int sum;
		for(int i=0;i<=arr.length-1;i++) {
			sum=arr[i]+1;
			
			if(sum!=arr[i+1]) {
				System.out.println("missing no is"+sum);
				break;
			}
		}
		
	System.out.println("it is consecutive");
	}

}
