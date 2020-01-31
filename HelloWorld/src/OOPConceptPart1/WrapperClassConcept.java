package OOPConceptPart1;

public class WrapperClassConcept {

	//Data conversion
	//A Wrapper class is a class whose object wraps or contains a primitive data types
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="100";
		System.out.println(a+20);
		
		//data conversion String to int
		int i= Integer.parseInt(a);
		System.out.println(i+20);
		
		//Int, Double, Character, Boolean 
		//Wrapper class
		//data conversion String to double
		String y="12.55";
		double d= Double.parseDouble(y);
		System.out.println(y+90);
		
		//String to boolean
		String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		//Int to String conversion
		int jc=300;
		System.out.println(jc+200);
		
		String s=String.valueOf(jc);
		System.out.println(s+20);
		
		// Below code will display the exception: Exception in thread "main" java.lang.NumberFormatException: For input string: "100a"
		String ja="100a";
		int ic= Integer.parseInt(ja); 
	}

}
