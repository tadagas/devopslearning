package com.automation.arraylist;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String args[]){  
	      ArrayList<String> alist=new ArrayList<String>();  
	      alist.add("Steve");
	      alist.add("Tim");
	      alist.add("Lucy");
	      alist.add("Pat");
	      alist.add("Angela");
	      alist.add("Tom");
	  
	      //displaying elements
	      System.out.println(alist);
	  
	      //Adding "Steve" at the fourth position
	      alist.add(3, "Steve");
	  
	      //displaying elements
	      System.out.println(alist);
	      
	      ArrayList<String> names = new ArrayList<String>();
	      names.add("Jim");
	      names.add("Jack");
	      names.add("Ajeet");
	      names.add("Chaitanya");
	      names.set(0, "Lucy");
	      System.out.println(names);
	      
	      ArrayList<String> alist1=new ArrayList<String>(); 
	      alist1.add("Steve");
	      alist1.add("Tim");
	      alist1.add("Lucy");
	      alist1.add("Pat");
	      alist1.add("Angela");
	      alist1.add("Tom");

	      //displaying elements
	      System.out.println(alist1);

	      //Removing "Steve" and "Angela"
	      alist1.remove("Steve");
	      alist1.remove("Angela");

	      //displaying elements
	      System.out.println(alist1);

	      //Removing 3rd element
	      alist1.remove(2);

	      //displaying elements
	      System.out.println(alist1);
	      
	      for(String str:alist1)  {
	          System.out.println(str);  
	       }  
	   }
}


