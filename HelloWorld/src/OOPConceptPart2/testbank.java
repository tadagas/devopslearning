package OOPConceptPart2;

public class testbank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RBI bank = new RBI();
		bank.carloan();
		bank.credit();
		bank.debit();
		bank.educationloan();
		bank.transfermoney();

		// Dynamic polymprsim
		// child class object can be referred by parent interface reference var.
		// only overridden methods can be called...
		USBank s = new RBI();
		s.credit();
		s.debit();
		s.transfermoney();

	}

}
