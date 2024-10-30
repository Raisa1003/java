package inheritance;

public class car extends Vehicle {

	
	String c="ford";
	int price=500000;
	public void show()
	{
		System.out.println("The model of car is " +c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car obj=new car();
		obj.display();
		obj.show();
		System.out.println(obj.str);
	}

}
