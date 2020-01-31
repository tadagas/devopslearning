package OOPConceptPart2;

public class TestBankLoans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(BankInterface.min_balance);
		
		StateBankOfMysore obj = new StateBankOfMysore();
		
		obj.carloan();
		obj.creditloan();
		obj.debitloan();
		obj.educationloan();
	
		StateBankOfIndia obj1= new StateBankOfIndia();
		obj1.creditloan();
		obj1.debitloan();
	}

}
