package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList ar = new ArrayList();
		//ArrayList ar1= new ArrayList[];
		
		// Array list always use add method to add a parameters into arraylist.
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
				
		System.out.println(ar.size());
		ar.add(400);
		ar.add(350);
		System.out.println(ar.size());
		
		ar.add("hell");
		ar.add('f');
		ar.add("12356");
		ar.add(12.5456);
		
		System.out.println(ar.size());
		System.out.println(ar.get(8));  // 10th index doesnt exit Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 10, Size: 9
		
		for (int i=0; i<ar.size(); i++) {
			System.out.println("Array List: ="+ i);
			
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
	}

}
