package com.java_pgms;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Collection_list {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(50);
	al.add(20);
	al.add(60);
	al.add(30);
	al.add(null);
	al.add(null);
	System.out.println("size is"+al.size());
	System.out.println(al.contains("nirmal"));
	al.add(2, 100);
	System.out.println(al);
	System.out.println(al.get(1));
	
	
	
   
  
}
}
