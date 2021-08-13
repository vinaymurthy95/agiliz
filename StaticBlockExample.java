package agiliz;

class Test {
    static int i;
    int j;
      
     
    static {
        i = 100;
        System.out.println("static block called ");
    }
   
}


public class StaticBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(Test.i); 

	}

}
