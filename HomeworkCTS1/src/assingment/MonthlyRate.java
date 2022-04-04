package assingment;

public class MonthlyRate extends Loan {

	public double monthRate;
	public double rateValue, loanValue;

	public double getMonthRate() {
		return monthRate;
	}

	public void setMonthRate(double monthRate, double rateValue, double loanValue) {
		this.monthRate = monthRate;
	}
	
	public double getMonthlyRate() {
		return loanValue*rateValue;
	}

	
}
