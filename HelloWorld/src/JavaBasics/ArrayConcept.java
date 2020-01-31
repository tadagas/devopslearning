package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Array: to store similar data types value in a array 	variable 
		// int array[]
		
		// Dis Advantages: Array size is fixed...  To over come this problem..
		// collections, Arraylist, Hashtable-- dynamic table.
		
		// Object Array..
		
		int a[]= new int [5];
		//highest index is 4 [4]
		//lowest index is 0[0]
		a[0]=201;
		a[1]=202;
		a[2]=203;
		a[3]=204;
		a[4]=205;
		
		System.out.println(a[2]);
		System.out.println(a[4]);
		//System.out.println(a[5]); //ava.lang.ArrayIndexOutOfBoundsException:
		
		System.out.println(a.length);
		
		for(int b=0; b<a.length; b++) {
			System.out.println(a[b]);
		}
			
		// double array
		double d[]= new double[4];
		
		d[0]=0.2356;
		d[1]=1.2356;
		d[2]=2.2356;
		d[3]=3.2356;
		//d[4]=4.2356;
		System.out.println(d[0]);
		System.out.println(d.length);
		
		for (int i=0; i<d.length; i++) {
			System.out.println(i);
		}
		
		
		// char array[]
		char c[]= new char[5];
		c[0]='a';
		c[4]='$';
		System.out.println(c[0]);
		System.out.println(c[4]);
		System.out.println(c.length);
		
		for (int f=0; f<c.length; f++) {
			System.out.println(f);
		}
		
		// boolean Array
		
		boolean b[]= new boolean[20];
		b[0]=true;
		b[1]=false;
		System.out.println(b[0]);
		System.out.println(b[1]);
		
		//String array
		
		String str[]= new String[5];
		str[0]="Hello World - India";
		str[1]="Hello World - Karnataka";
		str[2]="Hello World - Tarikere";
		str[3]="Hello World - Tadaga";
		str[4]="Hello World - ShivaTadaga";
		
		System.out.println(str[0]);
		System.out.println(str[1]);
		System.out.println(str.length);
		

		for (int v=0; v<str.length; v++) {
			System.out.println(v);
		}
		
		//Objecr Array : (object is a class) is used to store different types of values
		
		Object ob[]= new Object[5];
		
		ob[0]	=	true;
		ob[1]	= "shiva";
		ob[2]	= 'c';
		
		System.out.println(ob[1]);
		System.out.println(ob.length);
		
		for (int y=0; y<ob.length; y++) {
			System.out.println(ob.length);
			System.out.println(ob[2]);
		}
		
		
	}
}