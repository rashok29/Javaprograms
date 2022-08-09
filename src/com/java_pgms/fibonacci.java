package com.java_pgms;

public class fibonacci {
public static void main(String[] args) {
	//011235813
	int f=0;
	int  s=1;
	int t;
	System.out.println(f);
	System.out.println(s);
	for (int i = 3; i <=20; i++) {
		t=f+s;
		System.out.println(t);
		f=s;
		s=t;
		
	}
	
	
}
}
