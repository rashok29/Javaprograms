package com.java_pgms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicate_in_a_array {
	public static void main(String[] args) {
		int a[]={2,2,7,8,8,5,7,6};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				
				}
			}
		}
	//remove duplicates in array
		Integer b[]={2,2,7,8,8,5,7,6};
		List<Integer> asList = Arrays.asList(b);
		Set<Integer> s=new HashSet<>(asList);
		System.out.println(s);
	}
	}


