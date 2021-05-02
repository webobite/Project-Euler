package com.code.problem1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 3; i < 1000; i++) {
			if((i % 3 == 0) || (i % 5 == 0)) {
				sum = sum + i;
			}
		}
		
		System.out.println("sum of all the multiples of 3 or 5 below 1000 : : " + sum);

	}

}
