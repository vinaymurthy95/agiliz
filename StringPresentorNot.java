package agiliz;

public class StringPresentorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Technoelevate";
		String s2="Tech";
		String s3="Hello ";
		
		
		if(s1.contains(s2))
		{
			System.out.println(s2+" is present in Technoelevate ");
		}
		else
		{
			System.out.println(s2+" is not present in Technoelevate");
		}
		
		if(s1.contains(s3))
		{
			System.out.println(s3+" is present in Technoelevate");
		}
		else
		{
			System.out.println(s3+" is not present in Technoelevate");
		}

	}

}
