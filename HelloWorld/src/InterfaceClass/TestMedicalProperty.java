package InterfaceClass;

public abstract class TestMedicalProperty implements USMedical, UKMedical,IndiaMedical,WorldHealthMedical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		USMedical obj = null;
		
		obj.bloodcheckup();
		obj.urinetests();
		obj.tmt();

		UKMedical obj1 = null;
		
		obj1.bloodcheckup();
		obj1.urinetests();
		obj1.tmt();
		obj1.xray();
		
		IndiaMedical obj2=null;
		
		obj2.bloodcheckup();
		obj2.urinetests();
		obj2.tmt();
		obj2.xray();

	}

}
