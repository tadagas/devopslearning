package OOPConceptPart2;

public class StateBankOfMysore implements BankInterface {

	public void creditloan() {
		System.out.println("SBM allow the credit card loan");	
		}
		
		
		public void debitloan() {
			System.out.println("SBM allow the Debit loan");
		}
		
		public void carloan() {
			System.out.println("SBM allow the car loan");
		}
		
		public void educationloan() {
			System.out.println("SBM allow the education loan");
		}
}
