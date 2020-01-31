package JavaBasics;
import java.util.Hashtable;
public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable h= new Hashtable();

		h.put("a", "test");
		h.put("b", "12300");
		h.put("c", "Helo-123");
		
		System.out.println(h.size());
		
		h.put("y", "test");
		h.put("z", "12300");
		h.put("d", "Helo-123");
		h.put("n", 12.5456);
		
		System.out.println(h.size());
		System.out.println(h.get(8));  
		
		Hashtable<Integer,Integer> hi= new Hashtable<Integer,Integer>();
		
		hi.put(1,1256);
		hi.put(2,1256);
		
		Hashtable<String,String> str= new Hashtable<String,String>();
		str.put("123567","shiva");
		
	}

}
