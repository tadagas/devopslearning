package ExceptionsHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws Exception {

		System.out.println("ABC");

		try {
			throw new Exception("SHIVA");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("PQR");

		String Exec_flag="new";
		if(Exec_flag.equals("new")) {
			try{
				throw new Exception("Exec flag no except");
		
			} catch (Exception e) {
				e.printStackTrace();
			}
		
			System.out.println("String");
		}
	
	}
}
