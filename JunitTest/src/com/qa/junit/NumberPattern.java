package com.qa.junit;

import java.sql.Driver;
import java.util.Iterator;
import java.util.Set;

public class NumberPattern {
	
	public void setup() {
				
		//Method 1
		StringBuffer string = new StringBuffer("HelloWorld");
		System.out.println(string.reverse());
		System.out.println(string.capacity());
		System.out.println(string.charAt(7));
		System.out.println(string.toString());
		
		
		
		//Method 2
		System.out.println("Program ends for Reverse the String Method 1");
		String reverse1="Tested by Shiva";
		StringBuilder reverse2= new StringBuilder();
		reverse2.append(reverse1);
		reverse2=reverse2.reverse();
		for(int d=0; d<reverse2.length(); d++) {
			System.out.print(reverse2.charAt(d));
			
		}
		
		
	//https://www.softwaretestingmaterial.com/java-interview-questions/	
		
		System.out.println("Program Start for Number Patteren-------");
		
		for(int i=2;i<=10; i++) {
			for(int y=2; y<=i;y++) {
				System.out.print(y+ " ");
			}
			System.out.println();
		}
		
		int a=0;
		int b=1;
		int count=8;
		System.out.print(a+" "+b);
		
		for (int d=2; d<count; d++) {
			int c=a+b;
			System.out.println(" " +c);
			a=b;
			b=c;
			
		}
		
			int arr[]= {10,20,30,40,50};
			int val=arr[0];
			for(int g=0; g<arr.length;g++) {
				if(arr[g]>val) {
					val=arr[g];
				}
				}
			System.out.println(+val);
			
		}
		
		
		//Set<String> itr= Driver.getwindowhandles();
		//Iterator<String> s=itr.iterator();
		//String a=s.charAt(1);
	}
