package super_keyword;

public class Child extends Parent{

	String colour="Red";
	
	public void display()
	{
		super.display();
		System.out.println("Child class method");
		System.out.println(colour);
		System.out.println(super.colour);
		
	}
	
	public Child(String name)
	{
		super(name);
		System.out.println(super.secondary);
		System.out.println(super.colour); 
		
		System.out.println(name);
		
	System.out.println("Child class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj=new Child("Anu");
		obj.display();
	}

}
