package JavaBasics;

import java.util.ArrayList;

public class PractiseSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=50;
		int b=-250;
		int c=100;
		
		char x='a';
		char yc='b';
		
		double zy=1.456;
		double zx=1.756;
		
		boolean ab=true;
		boolean ac=false;
		
		String abc="hellow world";
		System.out.println("Hello World");
		System.out.println("Hello World + Hello India=" + (a+b));
		System.out.println("Hello World + Hello India=" + (zy+zx));
		System.out.println("Hello World + Hello India=" + (ab));
		System.out.println("Hello World + Hello India=" + (ac));
		
		System.out.println("Total count=" + (a+b+zy+zx) + (ab));
		
		if (a>b) {
			System.out.println("a is greather than b");
		}else
		{
			System.out.println("b is greather than c");
		}
		
		if (a>b & a>c) {
			System.out.println("a is greather than b");
		}else if(b>c) {
			System.out.println("b is greather than c");
		}else {
			System.out.println("c is greather than a");
		}
		
		//Array
		int ba[]=new int[5];
		ba[0]=10;
		
		boolean bl[]= new boolean[2];
		
		bl[0]=true;
		bl[1]=false;
		
		String str[]= new String[2];
		str[0]="shiva";
		str[1]="shiva";
		
		char ch[]= new char[2];
		ch[0]='c';
		ch[1]='b';
		
		Object obj[]= new Object[5];
		
		obj[0]=123;
		obj[1]="Hello-123";
		
		obj[2]	=	true;
		obj[3]	= "shiva";
		obj[4]	= 'c';
		
		for (int i=0; i<obj.length;i++) {
			System.out.println(i);
		}
			
		//2 Dimensional Array:
		 String list[][]= new String[3][3];
		 
		 
		 list[0][0]="a";
		 list[0][1]="b";
		 list[0][2]="c";
			
		 list[1][0]="g";
		 list[1][1]="h";
		 list[1][2]="i";
			
		 list[2][0]="x";
		 list[2][1]="y";
		 list[2][2]="z";
			
			System.out.println(list[0][0]);
			System.out.println(list[1][0]);
			System.out.println(list[2][2]);
			
			for(int row=0; row<list.length; row++) {
				for (int col=0; col<list[0].length; col++) {
					System.out.println(list[row][col]);
				}
			}
	}
}
