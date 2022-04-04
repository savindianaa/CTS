package assingment;

public class Fee {
	
	
	public double totalFee=0.0;
	AccountType account1;
	
	
	public static double calculateFee(AccountType[] account) {
	double totalFee=0.0;
	Loan loan;
	Rate rate;
	AccountType account1 = null;
	if(account1.type==3||account1.type==4)	
	{totalFee+=.0125	*	(	//	1.25%	broker's	fee
			Loan.loanValue*Math.pow(Rate.getRate(),(account1.daysActive/365)) - Loan.loanValue);}	//	interest-principal
	return totalFee;
	}
	
}
	

