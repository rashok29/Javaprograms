package com.java_pgms;

import java.util.Scanner;

public class Reverse_string {
public static void main(String[] args) {
	String str="Ashok";
 String rev="";
 int len=str.length();
 for (int i =len-1; i>=0 ; i--) {
	 rev=rev+str.charAt(i);
 }
	System.out.println(rev);
	if(str.equals(rev)) {
		System.out.println(str+ " is a palindrom ");
		
	}
	else {
		System.out.println(str+  " is not a palindrom ");
	}
}
 
	}