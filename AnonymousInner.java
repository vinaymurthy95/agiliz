package agiliz;

abstract class Person1
	{  
	  abstract void eat();  
	}  

public class AnonymousInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p1=new Person1() {
			
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("Nice fruits");
			}
		};
		p1.eat();
		//Person  p2=new Person1();
	}

}
