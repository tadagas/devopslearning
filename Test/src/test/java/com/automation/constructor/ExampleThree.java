package com.automation.constructor;

public class ExampleThree {

	private int var;
    //default constructor
    public ExampleThree()
    {
           this.var = 10;
    }
    //parameterized constructor
    public ExampleThree(int num)
    {
           this.var = num;
    }
    public int getValue()
    {
            return var;
    }
    public static void main(String args[])
    {
    	ExampleThree obj = new ExampleThree();
    	ExampleThree obj2 = new ExampleThree(100);
            System.out.println("var is: "+obj.getValue());
            System.out.println("var is: "+obj2.getValue());
    }
}
