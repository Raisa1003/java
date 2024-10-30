package Hierarchical;

public class Tester extends Employer {
	String name2="Taniya";
	
	public void employee2()
	{
		System.out.println("Tester name is "+name2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tester obj=new Tester();
		obj.details();
		obj.employee2();
		
		Developer obj2=new Developer();
		obj2.details();
		obj2.employee();

		
	}

}
