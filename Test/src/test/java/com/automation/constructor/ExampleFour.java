package com.automation.constructor;

public class ExampleFour {

	private int var;
    public ExampleFour()
    {
           int num = 10;
		var=num;
    }
    public int getValue()
    {
            return var;
    }
    public static void main(String args[])
    {
    	ExampleFour myobj = new ExampleFour();
        System.out.println("value of var is: "+myobj.getValue());
    }
}
	