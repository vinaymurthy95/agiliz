package agiliz;

public class ComparetwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java Techie";
		String str2="Python Techie";
		String str3=str1;
		if(str1.equals(str2))
		{
			System.out.println("Strings are equal ");
			System.out.println(str1.equals(str2));
		}
		else
		{
			System.out.println("strings are not equal ");
			System.out.println(str1.equals(str2));
		}
		
		if(str1.equals(str3))
		{
			System.out.println("Strings are equal ");
			System.out.println(str1.equals(str3));
		}
		else
		{
			System.out.println("strings are not equal ");
			System.out.println(str1.equals(str2));
		}
		
	}

}
