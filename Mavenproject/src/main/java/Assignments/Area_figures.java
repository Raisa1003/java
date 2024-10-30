package Assignments;

import java.util.Scanner;

public class Area_figures {
	

	public void area(int s)
	{
	
		int sq=s*s;
		System.out.println("Area of square is "+ sq);
		
	}
	
	
	public void area(int b,float h)
	{
		float rec=b*h;
		System.out.println("Area of rectangle is "+ rec);
		
	}
   public void area(double r)
 {
		double circle=3.14*r*r;
		System.out.print("Area of triangle is "+ circle);
		System.out.println(" ");
	   
 }
	public static void main(String[] args) {
		
		//square
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of square");

			int scan=sc.nextInt();
			
			System.out.println("The length of square is " +scan);
			Area_figures ob=new Area_figures();
			ob.area(scan);
			System.out.println(" ");
			//rectangle
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Enter the length and breadth of rectangle ");
			int rect=sc1.nextInt();
			float rect1=sc1.nextFloat();

			System.out.println("The length and breadth of rectangle is " +rect+ " "+rect1);
			Area_figures ob1=new Area_figures();
			ob1.area(rect,rect1);
		
			System.out.println(" ");
			//triangle
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Enter the radius of circle ");
			double r=sc2.nextDouble();
		
			System.out.println("The radius of circle is " +r);
			Area_figures ob2=new Area_figures();
			ob2.area(r);
			
			//System.out.println("The length and breadth of triangle " + tri+ " and "+tri1);
		//Area_figures ob1=new Area_figures();
		
		
		//ob1.area(5, 5.2f);
		//ob2.area(8,5);
		
		
	}

}
