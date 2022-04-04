package assingment;

public enum AccountType {
	STANDARD(1, 30),BUDGET(2, 90),PREMIUM(3, 180),SUPER_PREMIUM(4,365);
	
	public int daysActive, type;

	private AccountType(int type, int daysActive) {
		this.daysActive = daysActive;
		this.type = type;
	}

	public int getDaysActive() {
		return daysActive;
	}


	public int getType() {
		return type;
	}

	public void setType(int type, int daysActive) {
		if(this.daysActive==30) {
		this.type = 1;
	} else if (this.daysActive==90) {
		this.type = 1;
	}else if (this.daysActive==180) {
		this.type = 1;
	}else if (this.daysActive==3) {
		this.type = 1;
	}
	
	}
	
	
}
