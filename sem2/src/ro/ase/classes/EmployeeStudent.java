package ro.ase.classes;

public class EmployeeStudent {
	int salaryPerHour;
	int hours;

	public void reportHours(int hoursWorked) {
		hours+=hoursWorked;
	}
	
	public int calculateSalary()
	{
		return salaryPerHour * hours;
	}
	
	public int findMinInsideUnsortedArray(int [] v) throws Exception {
		if(v==null || v.length==0 ) {
			throw new Exception("Vector is null");
		}
		int min=v[0];
		for (int i=1; i<v.length; i++)
		{
			if(min>v[i]) {
				min=v[i];
			}
		}		
		return min;
	}
	
	public String getExam(int numberExam) throws Exception {
		String exams[] = {"OOP Exaam", "Java Exam","Data structure Exam", "C# Exam", "Statistics Exam" };
		if(numberExam>exams.length){
			throw new Exception ("exam must be in range 1 to 9");
		}
		else
			return exams[numberExam];
	}


}
