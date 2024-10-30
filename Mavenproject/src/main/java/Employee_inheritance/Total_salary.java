package Employee_inheritance;

public class Total_salary extends hra_pf{

	float salary;
	public void totalsalary()
	{ System.out.println("SALARY SLIP : ");
		salary=basicpay+hra+bonus-pf-deduct;
		System.out.println("Total salary "+ salary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Total_salary obj=new Total_salary();
		
		obj.totalsalary();
		obj.basic();
		obj.calcuate();
		
				
	}

}
