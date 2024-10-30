package multilevel_inheritance;

public class Dog extends Animal {
    String name="Dog";
	String breed="lab";
	
	public void display()
	 {
		 System.out.println(name);
	 }
	 public void display1()
	 {
		 System.out.println("Breed is "+breed);
	 }
}
