package agiliz;


class Student
{
	int id,cgpa;
	
		Student()
	{
		System.out.println("default ");
		
	}
	Student(String name)
	{
		System.out.println("student name is "+name);
	}
	
	Student(int id,String name)
	{
		System.out.println("student name and id are "+id+name);
	}
	
	Student(int id,String name,int cgpa)
	{
		System.out.println("student id,name and cgpa are  "+id+" "+name+"  "+cgpa);
	}
	
	
}

public class StudentCons {

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student("vinay");
		Student s3=new Student(10,"abc");
		Student s4=new Student(10,"abc",98);
		

	}

}
