//package learning;
import java.util.Scanner;

class cal
{
	int rol;
	String name,temp;
	Float marks;
	Scanner s=new Scanner(System.in);

	void input()
	{
		System.out.println("Enter the rollno, name, marks");
		rol=s.nextInt();
		name=s.next();
		temp=s.nextLine();
		marks=s.nextFloat();


	}
	void display()
	{
		System.out.println("Entered data are \n "+rol+"\n"+name+"\n"+marks);
	}
}

	class student
	{
		public static void main(String[] args)

		{
			cal c=new cal();
			c.input();
			c.display();
		}

	}

