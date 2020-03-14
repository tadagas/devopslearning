package com.qa.junit;

public class ConstructorClass {

	//3.1 Initializing an Object in Java
	//Initializing is done by a java constructor, memory is allocated and a reference is given to that memory.

	// Class Declaration
	
	// Instance Variables
	      String name;
	      String breed;
	      int age;
	      String color;
	// Constructor Declaration of Class
	         public ConstructorClass(String name, String breed,int age, String color)
	            {
	                this.name = name;
	                this.breed = breed;
	                this.age = age;
	                this.color = color;
	            }
	         
	// method 1
	      public String getName()
	      	{
	        return name;
	      	}
	      
	// method 2
	      public String getBreed()
	      {
	        return breed;
	      }
	      
	// method 3
	      public int getAge()
	      {
	        return age;
	      }
	// method 4
	      public String getColor()
	       		{
	            return color;
	       		}
	      @Override
	      public String toString()
	       		{
	            return("Hi my name is "+ this.getName()+
	            ".\nMy breed,age and color are " +
	            this.getBreed()+"," + this.getAge()+
	            ","+ this.getColor());
	       		}
	public static void main(String[] args)
	      		{
		ConstructorClass tuffy = new ConstructorClass("shadow","german shephard", 2, "golden");
	            System.out.println(tuffy.toString());
	      		}
	   }

