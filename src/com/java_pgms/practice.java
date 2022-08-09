package com.java_pgms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class practice {
public static void main(String[] args) throws IOException {
	HashMap hm=new HashMap();
	hm.put(101, "Ashok");
	hm.put(11,"Nirmal");
	hm.put(103, "Kumar");
	System.out.println(hm);
	Set s = hm.keySet();
	System.out.println(s);
	Collection c = hm.values();
	System.out.println(c);
	Set e = hm.entrySet();
	System.out.println(e);
	
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Ashok Ranjani\\eclipse-workspace\\Java programs\\src\\com\\java_pgms\\test.txt");
	p.load(fis);
	System.out.println(p);
	String s1 = p.getProperty("vadai");
	System.out.println(s1);
	p.setProperty("pongal", "50");
	
			
}
}