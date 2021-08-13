package agiliz;

class First
{
	int i;
	void display(int a,int b)
	{
		System.out.println("inside parent "+a+" "+b);
	}
}

class Second extends First
{
	int i;
	void display()
	{
		super.display(100,200);
		System.out.println("inside child");
	}
	
	Second(int a,int b)
	{
		super.i=a;
		i=b;
	}
}

public class SuperAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second s=new Second(10,20);
		s.display();

	}

}
