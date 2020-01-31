package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaCollections extends Employee {

	JavaCollections(String name, int age, String dept) {
		super(name, age, dept);
		// TODO Auto-generated constructor stub
	}

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= new int[5];  // size is fixed..
		//Dynamic array list
		//1. can contain duplicate values and elements
		//2. maintains insertion order
		//3. Synchronized 
		//4. Allows randam access to fetch the element because it stores the values on the basis of indexes
		
		arr[0]=123;
		arr[4]=455;
		System.out.println(arr[0]);
		System.out.println(arr[4]);
		
		for (int i=0; i<arr.length; i++) {
			System.out.println(i);
			
		}
		
		ArrayList ar= new ArrayList();
		ar.add("12356");
		ar.add("12d356");
		System.out.println(ar.size());
		
		ArrayList<Integer> ari= new ArrayList<Integer>();
		ari.add(1000);
		
		ArrayList<String> ars= new ArrayList<String>();
		ars.add(1000,null);
		ars.add("selenium");
		
		// Create a Array List
		
		ArrayList<E> are= new ArrayList<E>();
		
		//Employee class object
		Employee obj= new Employee("SHIVA",42,"QA");
		Employee obj1= new Employee("SHAMITH",12,"STUDENT");
		Employee obj2= new Employee("SHRUTHI",34,"HOUSE WIFE");
		Employee obj3= new Employee("SHRUMITH",2,"BABY");
		
		// Create a Array List using Employee
		ArrayList<Employee> arre= new ArrayList<Employee>();
		arre.add(obj);
		arre.add(obj1);
		arre.add(obj2);
		arre.add(obj3);
		
		
		// Iterator to traverse the values
		
		Iterator<Employee> itr= arre.iterator();
		while(itr.hasNext());
				Employee emp=itr.next();
				System.out.println(emp.name);
				System.out.println(emp.age);
				System.out.println(emp.dept);
				
		
	}

}
