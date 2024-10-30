package Employee_inheritance;

public class hra_pf extends Basicpay{
	
	float hra;
	float pf;
	public void calcuate()
	{
		hra=(float) (0.05*basicpay);
		pf=(float) (0.2*basicpay);
		System.out.println("HRA is "+ hra);
		System.out.println("PF is "+ pf);
		
	}

}
