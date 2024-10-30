package Assignments;

public class Factorial {
	int n;
	int num;
	int fact=1;
	public void calculate(int n)
	{
		this.num=n;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		
		this.display();
	}

	public void display()
	{
		
		System.out.println("The factorial of "+num+" is "+fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial obj=new Factorial();
		obj.calculate(5);
	}

}
