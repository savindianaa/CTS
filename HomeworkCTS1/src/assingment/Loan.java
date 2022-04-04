package assingment;

public class Loan {
	public static double loanValue;
	
	//get the loan value
	public double getLoan() {
		return loanValue;
	}
	
	public void setLoan(double value) throws Exception {
		if(value<0)
			throw new Exception();
		else
		{
			loanValue = value;
		}
	}
}
