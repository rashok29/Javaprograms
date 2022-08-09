package com.java_pgms;

import java.util.Scanner;

public class Practice_pgm {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter num");
int num=s.nextInt();
int temp=num;
int arm=0;
int rem;
while (num>0) {
	rem=num%10;
	arm=arm+(rem*rem*rem);
	num=num/10;
} 
if (temp == arm) {
	System.out.println("Armstrong");
}else {
		System.out.println("not");
	}
}
}

