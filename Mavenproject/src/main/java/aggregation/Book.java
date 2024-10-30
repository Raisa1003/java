package aggregation;

public class Book {

	
	String bname;
	int price;
	Author ath;
	public Book(String bname,int price,Author ath)
	{
		this.bname=bname;
		this.price=price;
		this.ath=ath;
	}
	
	public void display()
    {
		System.out.println("Book name :"+bname);
		System.out.println("Book price :"+price);
		System.out.println("Author name : :"+ath.authorname);
		System.out.println("Author place :" +ath.place);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Author obj=new Author("JK Rowling","London");
		Book obj1=new Book("Harry Potter",1500,obj);
		obj1.display();
	}

}
