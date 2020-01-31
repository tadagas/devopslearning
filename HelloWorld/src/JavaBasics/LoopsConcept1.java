package JavaBasics;
import java.util.Arrays;

public class LoopsConcept1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		
		int i=1;
		while(i<10) {
		System.out.println(i);
		i=i+1;
			
		}
		
//		int k=10;
//		while(k>=1) {
//			System.out.println(k);
//			k=k-0;
//		}
		
		for (int k=10; k>1; k--) {
			System.out.println(k);
		}
*/		
		
		
		String str1[][]= new String[2][5];
		str1[0][0]="a";
		str1[0][1]="b";
		str1[0][2]="c";
		str1[0][3]="d";
		str1[0][4]="f";
		
		str1[1][0]="g";
		str1[1][1]="h";
		str1[1][2]="i";
		str1[1][3]="x";
		str1[1][4]="y";

		
		System.out.println(str1.length);
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(str1[0][2]);
		
		
				//pre increment
				int a=10;
				int b=20;
				System.out.println(a);
				System.out.println(b);
				
				
				b=++a;
				a=b++;
				
				
				System.out.println(a);
				System.out.println(b);
				// One dimensional array
				//Two Dimensional Array
				//Array size is fixed
				int j[]=new int[2];
				int i[][]= new int[10][20];
				j[0]=100;
				i[0][0]=500;
				
				System.out.println(j.length);
				System.out.println(i.length);
				System.out.println(j[0]);
				System.out.println(i[0][0]);
				
				
				// double array
				double d[]= new double[4];
				
				d[0]=0.2356;
				d[1]=1.2356;
				d[2]=2.2356;
				d[3]=3.2356;
				//d[4]=4.2356;
				System.out.println(d[0]);
				
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
				
				boolean bc[]= new boolean[20];
				bc[0]=true;
				bc[1]=false;
				System.out.println(bc[0]);
				System.out.println(bc[1]);
				
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
				
				
				//Objecr Array : (object is a class) is used to store different  data types values
				
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
				
				String str11[][]= new String[2][5];
				str11[0][0]="a";
				str11[0][1]="b";
				str11[0][2]="c";
				str11[0][3]="d";
				str11[0][4]="f";
				
				str11[1][0]="g";
				str11[1][1]="h";
				str11[1][2]="i";
				str11[1][3]="x";
				str11[1][4]="y";

				
				System.out.println(str11.length);
				System.out.println(str11[0]);
				System.out.println(str11[1]);
				System.out.println(str11[0][2]);
				
	}

}
