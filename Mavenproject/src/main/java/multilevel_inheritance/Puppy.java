package multilevel_inheritance;

public class Puppy extends Dog{

	int a=5000;
	
	public void rate()
	{
		System.out.println("the price of puppy is " +a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Puppy obj=new Puppy();
		obj.type1();
		obj.display();
		obj.display1();
		obj.rate();
	}

}
