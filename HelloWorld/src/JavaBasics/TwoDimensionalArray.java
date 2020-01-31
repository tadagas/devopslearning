package JavaBasics;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[][]= new String [3][3];
		System.out.println(a.length);
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[0][2]);
		
		a[0][0]="a";
		a[0][1]="b";
		a[0][2]="c";
		
		a[1][0]="g";
		a[1][1]="h";
		a[1][2]="i";
		
		a[2][0]="x";
		a[2][1]="y";
		a[2][2]="z";
		
		System.out.println(a[0][0]);
		System.out.println(a[1][0]);
		System.out.println(a[2][2]);
		
		for(int row=0; row<a.length; row++) {
			for (int col=0; col<a[0].length; col++) {
				System.out.println(a[row][col]);
			}
		}
	}

}
