package Assignments;

public class Reversenumber {
     
	int number;
	int rev;
	int temp;
	public Reversenumber(int number)
	{
		
		while(number!=0)
		{
		temp=number%10;
		rev=rev*10+temp;
		number=number/10;
		}
		
	}
	
	
	public Reversenumber()
	{   
		this(65845);
		System.out.println("The reversed number is " +rev);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
  new Reversenumber();
     
      
	}

}
