package com.java_pgms;

import java.util.Scanner;

public class Reverse_numberAndPalindromNumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int temp=num;
		int j=0;
		
		
		while (num>0) {
		int b=num%10;
			j=(j*10)+b;	
		num=num/10;
	} 
//		System.out.print(j);
		if (j==temp) {
			System.out.println("paindrom number");
		}
		else {
			System.out.println("not a palindrome number");
		}
	}
}
	
