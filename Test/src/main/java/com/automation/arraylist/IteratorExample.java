package com.automation.arraylist;

import java.util.ArrayList;
import java.util.Iterator;


public class IteratorExample {

	public static void main(String args[]){
	ArrayList<String> name1= new ArrayList<String>();
	name1.add("shruthi");
	name1.add("shiva");
	name1.add("shamith");
	name1.add("shrumith");
	
	 ArrayList<String> names = new ArrayList<String>();
	    names.add("Chaitanya");
	    names.add("Steve");
	    names.add("Jack");
	    
	    Iterator itera = name1.iterator();
	    
	    while(itera.hasNext()) {
	      String obj = (String)itera.next();
	      System.out.println(obj);
	    }
}

	    
	ArrayList<Integer> itr1= new ArrayList<Integer>();
	
	
	
}
