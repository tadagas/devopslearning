package com.qa.page.learningcurve;

import java.util.Iterator;
import java.util.TreeSet;

class Tree { } 
class Pine extends Tree { } 
class Oak extends Tree { } 
public class th {

	public static void main(String[] args) {
		
		int x = 3; 
		int y = 1; 
		if (x = y) /* Line 3 */
		{
		    System.out.println("x =" + x); 
		}
		
		// int x = 10;
	   //     for (int y=0; y<5; y++, x--)
	            System.out.print(x + ", ");
		
		TreeSet map = new TreeSet();
		map.add("one");
		map.add("two");
		map.add("three");
		map.add("four");
		map.add("one");
		Iterator it = map.iterator();
		while (it.hasNext() ) 
		{
		    System.out.print( it.next() + " " );
		}
		
		String s = "42";
        try 
        {
            s = s.concat(".5");  /* Line 8 */
            double d = Double.parseDouble(s);
            s = Double.toString(d);
            int x = (int) Math.ceil(Double.valueOf(s).doubleValue());
            System.out.println(x);
        }
        catch (NumberFormatException e) 
        {
            System.out.println("bad number");
        }
        
		 	Tree tree = new Pine(); 
	        if( tree instanceof Pine ) 
	            System.out.println ("Pine"); 
	        else if( tree instanceof Tree ) 
	            System.out.println ("Tree"); 
	        else if( tree instanceof Oak ) 
	            System.out.println ( "Oak" ); 
	        else 
	            System.out.println ("Oops "); 
	    
	
		        try 
		        { 
		            return; 
		        } 
		        finally 
		        {
		            System.out.println( "Finally" ); 
		        } 
		    } 
		
	}


