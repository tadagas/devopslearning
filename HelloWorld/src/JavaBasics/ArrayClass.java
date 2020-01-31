package JavaBasics;

import java.util.ArrayList;
import java.util.Hashtable;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Two Dimensional Array.
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
		System.out.println(str11[0][0]);
		System.out.println(str11[1][1]);
		System.out.println(str11[0][2]);
		
		
	/*	for(int row=0; row<str11.length; row++) {
			for (int col=0; col<str11.length; col++) {
				System.out.println(str11[row][col]);
			}
		}
		*/
		
		//Array List
		
		ArrayList arr= new ArrayList();
		
		arr.add("1123sasa");
		arr.add("1123sasa");
		arr.add("Hello");
		arr.add("123");
		
		System.out.println(arr.size());
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		System.out.println(arr.get(3));
		for (int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
		
		// To print all the values of the ArrayList : For loop
		
		System.out.println("Check the array size =" + arr.size());
		for (int row=0; row<arr.size(); row++) {
			for(int col=0; col<arr.size(); col++) {
				System.out.println(row);
				System.out.println(col);
			}
			
		}
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(2000);
		a1.add(3000);
		System.out.println(a1);
		System.out.println(a1.size());
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("shiva");
		str.add("Altaf");
		System.out.println(str);
		System.out.println(str.size());
		
		
		// Hash Table
		
		Hashtable ht = new Hashtable();
		ht.put("A"," 1230");
		
		Hashtable<Integer, Integer> ht1= new Hashtable<Integer, Integer>();
		
		ht1.put(1,1230);
		ht1.put(2,2530);
		ht1.remove(1);
		System.out.println(ht1.size());
		
		

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
				
				String str12[]= new String[5];
				str12[0]="Hello World - India";
				str12[1]="Hello World - Karnataka";
				str12[2]="Hello World - Tarikere";
				str12[3]="Hello World - Tadaga";
				str12[4]="Hello World - ShivaTadaga";
				
				System.out.println(str12[0]);
				System.out.println(str12[1]);
				System.out.println(str12.length);
				

				for (int v=0; v<str12.length; v++) {
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


