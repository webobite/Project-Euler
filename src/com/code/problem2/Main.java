package com.code.problem2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long sum = 1;
		long result = 0;
		System.out.print(sum + " ");
		for(long i = 2; i <= 4000000; i++) {
			sum += i;
			if(sum % 2 == 0) {
				result += sum;
			}
//			System.out.print(sum + " ");
		}
		
		System.out.println("Sum of the even-valued terms till four million : : " + result);

	}

}
