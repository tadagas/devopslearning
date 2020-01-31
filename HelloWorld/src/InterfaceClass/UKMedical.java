package InterfaceClass;

public interface UKMedical {

	public  void xray();
	
	public  void tmt();
	
	public  void bloodcheckup();
	
	public  void urinetests();
	
	
	//static methods
	
	public static void ancologytest() {
		System.out.println("Test only on UK: ancologytest");
	}
	
	public static void Gynocolgisttest() {
		System.out.println("Test only on UK: Gynocolgisttest");
	}
	
	public static void urineinspection() {
		System.out.println("Test only on UK: urineinspection");
	}
	
	public static void dengue() {
		System.out.println("Test only on UK: dengue");
	}
}
