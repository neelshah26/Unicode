import java.util.*;
class Library
{
	private static int total=100;
	public void returned(int x)
	{
		total=total+x;
		System.out.println("Books are submitted");
	}
	public void borrow(int y)
	{
		total=total-y;
		System.out.println("Books are issued");
	}
	public static int display()
	{
		return total;
	}
}
class Student
{
	private int id,books;
	private String name;
	public Scanner sc = new Scanner(System.in);
	public Student()
	{
		System.out.println("Enter your name,ID,current number of books you have:");
		name=sc.nextLine();
		id=sc.nextInt();
		books=sc.nextInt();
		if(books>=4)
		{
			System.out.println("Number of books cannot be greater than 3");
			System.out.println("Enter the Number of books you have:");
			books=sc.nextInt();
		}
		
	}
	public void returned()
	{
		int a,b=books;
		System.out.println("Enter your number of books:");
		a=sc.nextInt();
		b=a+b;
		if(b<4)
		{
			Library l = new Library();
			l.returned(a);
		}
		else
		System.out.println("Invalid Input");
	}
	public void borrow()
	{
		int a,b;
		System.out.println("Enter the no of books to be borrowed:");
		a=sc.nextInt();
		b=a+books;
		if(b<=3)
		{
			Library l = new Library();
			l.borrow(b);
		}
		else 
		{
			System.out.println("Not more than 3 books can be issued at a time");
		}
	}
}
class Main
{
	public static void main(String args[])
	{
		int choice=0,t;
		Student s = new Student();
		Scanner sc = new Scanner(System.in);
		while(choice!=4)
		{
			System.out.println("Enter your choice\n1.Borrow\n2.Return\n3.Display\n4.Exit");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: s.borrow();
			 		break;
				case 2: s.returned();
					break;
				case 3: Library lb = new Library();
					t=lb.display();
					System.out.println("Total number of books are :"+t);
					break;
				case 4: System.exit(0);
					break;
			}
		}
	}
}
		 

		
		
		

				




 




