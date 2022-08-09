package com.java_pgms;

public class ReverseString {
public static void main(String[] args) {
	

	String str="Welcome to World";
	String rev="";
	String[] allword = str.split(" ");
	
	for (String word : allword) {
		String rev1="";
		
	
	for (int i =word.length()-1 ; i>=0 ; i--) {
		rev1=rev1+word.charAt(i);
	}	rev=rev+rev1+" ";
	
	}
	System.out.println(rev);



}
}
