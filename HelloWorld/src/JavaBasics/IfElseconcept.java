package JavaBasics;

public class IfElseconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}else
		
			System.out.println("a is smaller than b");
		
		//Comparision of two digits:
		int c=20;
		int d=21;
		
		if(c==d) {
			System.out.println("c is equal to d");
		}else
			System.out.println("c is not equal to d");
		
		int x=500;
		int y=600;
		int z=700;
		
		if(x>y & x<z){
			System.out.println("x is greater than y and z");
		}else if (y>z) {
			System.out.println("y is greater than x and z");
		}
		else{
			System.out.println("y is greater than x and z");
		}
		
	}
	

}
