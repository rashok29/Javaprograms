package com.java_pgms;

public class StringConcepts {
public static void main(String[] args) {
	

	String str="Greens Technology";
	String str1="Greens Technology";
	System.out.println(System.identityHashCode(str));
	String replace = str.replace("Technology", "Tech");
System.out.println(replace);
System.out.println(str);
System.out.println(System.identityHashCode(str));
System.out.println(System.identityHashCode(str1));
System.out.println(System.identityHashCode(replace));
StringBuffer sb=new StringBuffer("Ashok");
StringBuilder sbd=new StringBuilder("Kumar");
System.out.println(System.identityHashCode(sb));
System.out.println(System.identityHashCode(sbd));

}

}
