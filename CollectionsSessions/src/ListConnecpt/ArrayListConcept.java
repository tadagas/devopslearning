package ListConnecpt;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= new int[3];  // static array -- size is fixed..
			a[0]=156;
			a[1]=123;
			a[2]=10;
		
		//Dynamic array-- ArrayList]
		//1. can contain duplicate values/elements
		//2. maintains insertion order
		//3. Synchronized
		//4. Allows randam access to fetch the element because it stores the values on the basis of indexes
			
		ArrayList ar= new ArrayList();
		
		ar.add(10);
		ar.add(5);
		ar.add(100);
		
		ar.add("454545");
		ar.add('c');
		ar.add("hello World");
		System.out.println(ar.size());
		//System.out.println(ar.get(2));
		
		//To print all the values using for loop
		// Using iteration.
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		// Non Generic  VS Generic means <>
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(100);
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("100");
		System.out.println(str);
		
		ArrayList s = new ArrayList();
		
		// EmpInfo class objects:
		EmpInfo ep= new EmpInfo ("Naveen",27,"QA");
		EmpInfo ep1= new EmpInfo ("Smith",37,"DEV");
		EmpInfo ep2= new EmpInfo ("Jerry",35,"ADMIN");
		
		// Create arraylist:
		ArrayList<EmpInfo> ara= new ArrayList<EmpInfo>();
		ara.add(ep);
		ara.add(ep1);
		ara.add(ep2);
		
		//Iterator to traverse the values:
		Iterator<EmpInfo> it = ara.iterator();
		while(it.hasNext()) {
			EmpInfo emp= it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		//Add All()
		
		ArrayList<String> stri = new ArrayList<String>();
		
		stri.add("test");
		stri.add("selenium");
		
		ArrayList<String> strin = new ArrayList<String>();
		
		strin.add("DEV");
		strin.add(".NET");
		strin.add(".NETCORE");
		
		stri.addAll(strin);
		
		for (int i=0; i<stri.size(); i++) {
			System.out.println(stri.get(i));
		}
		
		
		//remove All
		stri.removeAll(strin);
		for (int i=0; i<stri.size(); i++) {
			System.out.println(stri.get(i));
		}
		
		System.out.println(strin);
		System.out.println(stri);
		
		stri.size();
		
	}
	

}
