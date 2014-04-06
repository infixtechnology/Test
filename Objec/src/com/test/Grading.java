package com.test;

import java.util.Scanner;

public class Grading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a int number");
		int a = scan.nextInt();
		
		if(a%2==0){
			System.out.println("the number is even");
			
		}
		else if(a%2==1){
			System.out.println("the number is odd");
		}
		

	}

}
