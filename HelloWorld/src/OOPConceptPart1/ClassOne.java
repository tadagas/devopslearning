package OOPConceptPart1;

public class ClassOne {

	String mod;
	String wheel;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// he a,b,c is a object reference variable

		ClassOne a = new ClassOne();
		ClassOne b = new ClassOne();
		ClassOne c = new ClassOne();
		
		a=b;
		b=c;
		c=a;
		
		a.mod="2018";
		a.wheel="4";
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		a.mod="2019";
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
	}

}
