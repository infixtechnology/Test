package com.test;

public class Grading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 60;
		
		if(mark>=90){
			System.out.println("A grade");
		}
		
		else if(mark<80){
			System.out.println("B Grade");
		}
		
		else if(mark<65){
			System.out.println("C grade");
			
		}
		else{
		System.out.println("Fail");	
		}
	}

}
