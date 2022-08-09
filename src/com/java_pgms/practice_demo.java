package com.java_pgms;

public class practice_demo {
	public static void main(String[] args) {
		for (int i = 1; i<=3; i++) {
			for (int j = 3; j >=i ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	String str="Abc";
	String s2="dcss";
	String s3="jhssdsds";
	String concat = str.concat(s2).concat(s3);
	System.out.println(concat);
	
	}
}
