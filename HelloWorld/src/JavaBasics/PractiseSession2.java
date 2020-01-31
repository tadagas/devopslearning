package JavaBasics;

public class PractiseSession2 {

	// main() method --- starting/execution point of the program.
	// second java session.

	/*
	 * New Project us
	 * 
	 */
	public static void main(String[] args) {

		//PractiseSession2 obj = new PractiseSession2(20, 30);
		//int cd = (cc + a);
		//obj.sum(cd);
		
		// For loop
		
		//Loops like while and for loop
		
				int i=1;
				while(i<=5);
				{
					System.out.println(i);
					//i=i+1;
				}
		

		int a = 10;
		String b = "1.2356";
		String g = "Hellow World-1.2356596";
		boolean c = true;
		double d = 1.253;
		char cc = 'g';
		int f = -10;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(f);
		System.out.println(cc);
		// Comment
		System.out.println(g);
		
		
		
		//concatenation operator: using + sign
		int gh=200; int ga=200;
		String ab="hello World JAVA="; String ac="World";
		System.out.println(gh+ga);
		System.out.println(gh+ab);
		System.out.println(gh+ac);
		System.out.println((gh+ga)+ab);
		
		System.out.println(ac+ab+(gh+ga));
		
		System.out.println(" Welcome to Java =" +ga);
		System.out.println(" Welcome to Java =" +(gh+ga));
		
		int w=10;
		int z=20;
		if(w>z){
			System.out.println("w is greater than z");
		}else
		{
			System.out.println("z is greater than w");
		}
		
		int ba=10;
		int bb=20;
		int bc=30;
		
		if(ba>bb & ba>bc){
			System.out.println("ba is greatest");
		}else if (bb>bc){
			System.out.println("bb is greatest");
		}else
		{
			System.out.println("bc is greatest");
		}
		
		int ax=10;
		int bx=20;
		
		if(ax>bx) {
			System.out.println("a is greater than b");
		}else
		
			System.out.println("a is smaller than b");
		
		//Comparision of two digits:
		int cx=20;
		int dx=21;
		
		if(cx==dx) {
			System.out.println("c is equal to d");
		}else
			System.out.println("c is not equal to d");
		
		int x=500;
		int y=600;
		int zx=700;
		
		if(x>y & x<zx){
			System.out.println("x is greater than y and z");
		}else if (y>zx) {
			System.out.println("y is greater than x and z");
		}
		else{
			System.out.println("y is greater than x and z");
		}
		
	}

	
}
