package com.qa.junit;
//https://data-flair.training/blogs/decision-making-in-java/
public class LastJavaProgram {
		public static int age=42;
		
		int abc=20;
		int marks_phy;
		int marks_maths;
		int marks_chem;
		
		public int addition(int ax, int az) {
			
			int ss;
			ss=ax+az;
			return ss;
			
		}
	//extends NumberPattern
	public static void main(String[] args) {
		
		
		int number = 20;
	    if (number == 10)
	      System.out.println("number is 10");
	    else if (number == 15)
	      System.out.println("number is 15");
	    else if (number == 20)
	      System.out.println("number is 20");
	    else
	      System.out.println("number is not present");
		
		int number1 = 25;
	    if (number1 < 15) 
	    	System.out.println("Number is smaller than 15");
	    
	    else 
	    	
	    	System.out.println("Number is greater than 15");
	    
	    
	    
		int xyz=1;
		while(xyz<5) {
			xyz++;
			//--xyz; //infinite loop
			System.out.println("Results for while loop :" + xyz);
		}
		
		for (int as=0; as<10; as++) {
			System.out.println("Result of For Loop =:" + as);
		}
		
		String[] arraylist= {"java","ruby","python","c++","c#"};
		int[] array= {10,20,30};
		int value1=array[0];
		for(String count:arraylist) {
			System.out.println(count);
		}
		
		for(int count1: array) {
			System.out.println(count1);
			if(value1>=count1) {
				System.out.println(value1);
			}
		}
		
		
		
		  // Arrays cannot be compared with relational operators because objects store references not the value		
		int operand1 = 20, operand2 = 10, operand3 = 0, operand4 = 20, operand5 = 40;

		System.out.println("Value of operand3 (++operand1) = " + operand3);//operand3 = operand1;
		  // post increment operator
		             operand3 = operand2++;// operand3 = b
		             System.out.println("Value of operand3 (operand2++) = " + operand3);//operand2 = operand2 + 1
		  // pre-decrement operator
		             operand3 = --operand4;// operand4 = operand4-1 
		             System.out.println("Value of operand3 (--operand4) = " + operand3);//operand3=operand4
		  // post-decrement operator
		             operand3 = --operand5;// operand3 = operand5
		             System.out.println("Value of operand3 (--operand5) = " + operand3);// operand5 = operand5 - 1
		  // Logical not operator
		             //System.out.println("Value of !condition =" + !condition);
		
        String stringname1 = "DataFlair's"; 
        String stringname2 = " Java Tutorial";
        // using + operator with strings it will concatenate the strings
        System.out.println("Welcome to "+stringname1 +stringname2);
        // using + and - arithmetic operator
        System.out.println("Adding(+) two operands= "+(operand1 + operand2));
        System.out.println("Adding two numbers  =:" + (operand2+operand2));
        
        System.out.println("Subtracting(-) two operands= "+(operand1 - operand2));
        // * and / operator
        System.out.println("Multiplying(*) two operands= "+(operand1 * operand2));
        System.out.println("Dividing(/) two operands= "+(operand1 / operand2));
        // modulus operator gives remainder on dividing first operand with second
        System.out.println("Modulus(%) of two operands= "+(operand1 % operand2));
        
        System.out.println("operand1 == operand2 :" + (operand1 == operand2));
        System.out.println("operand1 < operand2 :" + (operand1 < operand2));
        System.out.println("operand1 <= operand2 :" + (operand1 <= operand2));
        System.out.println("operand1 > operand2 :" + (operand1 > operand2));
        System.out.println("operand1 >= operand2 :" + (operand1 >= operand2));
        System.out.println("operand1 != operand2 :" + (operand1 != operand2));
        
		System.out.println(age);
		char cha='c';
		System.out.println(cha);
		
			LastJavaProgram a= new LastJavaProgram();
			//accessing static variable without object
			System.out.println(age);
			//local variable can be accessed on main method using object reference variable. 
			System.out.println(a.abc);
		
			LastJavaProgram obj= new LastJavaProgram();
			obj.marks_phy=60;
			obj.marks_chem=80;
			obj.marks_maths=80;
			
			LastJavaProgram obj1= new LastJavaProgram();
		
			obj1.marks_phy=60;
			obj1.marks_chem=70;
			obj1.marks_maths=80;
			
			LastJavaProgram obj2= new LastJavaProgram();
			obj2.marks_phy=60;
			obj2.marks_chem=50;
			obj2.marks_maths=80;
			
			LastJavaProgram obj3= new LastJavaProgram();
			obj3.marks_phy=60;
			obj3.marks_chem=60;
			obj3.marks_maths=80;
			System.out.println(obj.marks_chem);
			System.out.println(obj1.marks_chem);
			System.out.println(obj2.marks_chem);
			System.out.println(obj3.marks_chem);
			
		//int abc=42/0;
		//System.out.println(abc);
			
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
 
		
		//int[] array=new int[100];
		//int arr[] = new int[5];
		
		int arrayset[]= {50,10,20,30};
		
		int value=arrayset[2];
		for(int ac=0; ac<arrayset.length; ac++) {
			System.out.println(ac);
			System.out.println(arrayset[ac]);
			
			if(ac>value) {
				
			}
		}
		
		/**
		System.out.println(array.length);
		
		System.out.println(arr.length);
				
		String s="abc";
		
		System.out.println("Hello World");
		System.out.print("Hello");
		System.out.println("sss");

		
		System.out.toString();
		
		int a;
		a=20;
		int ab=20;
		int value1=0;
		int number=1050;
		int shiva=5655560;
		System.out.println(number);
		System.out.println(a);
		System.out.println(shiva);
		
		double d=256;
		double c=5.56;
		System.out.println(d);
		System.out.println(c);
		
		float f=1.45645f;
		System.out.println(f);
		
		
		boolean b=false;
		System.out.println(b);
		boolean cd=true;
		int y = 0;
	//	y= b + cd;
		
		System.out.println(y);
		if(b==true) {
		System.out.println(b);
		**/	
		}
		
	}


