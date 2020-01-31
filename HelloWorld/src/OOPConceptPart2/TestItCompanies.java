package OOPConceptPart2;

public class TestItCompanies {

	public static void main(String[] args) {
		// when same method is present in parent  class as well as in child class with the same number of arguments is called method-overriding.
		
		
		// static polymorphism -- or -- compile time polymorphism 
		BangaloreItCompanies obj= new BangaloreItCompanies();
		obj.empsalary();
		obj.moreitcompanies();
		obj.loc();
		
		PuneItCompanies obj1= new PuneItCompanies();
		obj1.moreitcompanies();
		
		// Dynamic polymorphism -- or -- compile time polymorphism
		//Child class object can be referred by parent class referrence variable -- Dynamic Polymorphsim or run time polymorphsim.
		//BangaloreItCompanies info= new IndianItCompanies();
		/*info.empsalary();
		info.moreitcompanies();
		info.empcount();
		info.emprevenue();
		info.loc();
	*/
		
	}

}
