package aggregation;

public class Student {

	String name;
	int age;
	int marks;
	
	Address addr;
	
	public Student(String name,int age,int marks,Address addr)
	{
		
		this.name=name;
		this.age=age;
		this.marks=marks;
		this.addr=addr;     //ref variable
	}
	
	public void display()
	{
		System.out.println("Student name :"+name);
		System.out.println("Student age :"+age);
		System.out.println("Student marks :"+marks);
		System.out.println("House name :"+addr.housename);
		System.out.println("House number :"+addr.housenum);
		System.out.println("Place :"+addr.place);
		System.out.println("Pin :"+addr.pin);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Address obj=new Address("ABC",122,"KTM",686516);
      Student obj1=new Student("Sona",25,60,obj);
      obj1.display();
	}

}
