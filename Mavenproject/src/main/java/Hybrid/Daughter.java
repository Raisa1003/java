package Hybrid;

public class Daughter extends Father {

	String dname="Reshma";
	
	public void daughtername()
	{
		System.out.println("Daughter name is " +dname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Daughter obj=new Daughter();
        obj.daughtername();
        obj.fathername();
        obj.Grandfathername();
        
        Son obj1=new Son();
        obj1.sonname();
        obj1.fathername();
        obj1.Grandfathername();
        
	}

}
