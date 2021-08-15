package agiliz;

class Person
{
	int id=100;
	double value=25.34;
	void display1()
	{
		System.out.println("As a Person");
	}
	
	Person()
	{
		System.out.println("person range from age 18 to 45");
	}
	
}

class Employee1 extends Person
{
	int basicsalary=10000;
	String Company="VISL";
	int id=500;
	String Name;
	
	void Total()
	{
		super.display1();
		System.out.println("Employee Basic Salary is "+basicsalary);
	}
	

}

class Manager1 extends Employee1
{
	int bonus=5000;
	void Total()
	{
		System.out.println("Salary for Manager is "+(basicsalary+bonus));
	}
	void role()
	{
		System.out.println("Managing director");
	}
}

public class MultiLevel {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		Person p=new Person();
		Employee1 e1=new Employee1();
		Manager1 m1=new Manager1();
		
		p.display1();
		e1.Total();
		m1.Total();
		System.out.println(m1.Company);
		System.out.println(e1.id);
		System.out.println(m1.id);
		System.out.println(p.id);
		System.out.println(m1.basicsalary);
		m1.display1();
		System.out.println(m1.value);
		m1.role();
		
	}

}
