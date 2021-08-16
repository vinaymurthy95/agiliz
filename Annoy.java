package agiliz;

 interface emp
 {
	 void eat1();
}

public class Annoy
{
public static void main(String [] args)
{
	emp e=new emp() {
		
		@Override
		public void eat1() {
			// TODO Auto-generated method stub
			System.out.println("hii hello ");
		}
	};
		
		
	e.eat1();
}
}