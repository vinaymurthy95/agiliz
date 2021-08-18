package agiliz;

import java.io.FileOutputStream;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try(FileOutputStream fileOutputStream =new FileOutputStream("C:\\Users\\v\\eclipse-workspace\\Assignments\\src\\agiliz\\Abc.txt")){      
			String msg = "Welcome to javaTpoint! ";      
			byte byteArray[] = msg.getBytes(); //converting string into byte array      
			fileOutputStream.write(byteArray);  
			System.out.println("Message written to file successfuly!");      
			}catch(Exception exception){  
			       System.out.println(exception);  
			}     

	}

}
