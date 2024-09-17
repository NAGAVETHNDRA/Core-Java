
import java.io.*;

public class Lab822 {
	public static void main(String ar[]) {
		
		try{ 
			File myfile = new File("D:\\MyJLC2.0\\Hello.java"); 
			System.out.println("\t"+myfile); 
			boolean flag = myfile.exists(); 
			System.out.println("\t Hello.java exist ? "+flag); 
			
			boolean x = myfile.createNewFile();
			System.out.println("\t hello.java creates ?"+x);
			
			flag = myfile.exists(); 
			System.out.println("\t Hello.java exist ? "+flag); 
			
			 x = myfile.createNewFile();
			System.out.println("\t hello.java creates ?"+x);
			
			
			boolean y = myfile.delete();
			System.out.println("\t hello.java exist? "+y);
			
			System.out.println(" Done!!! "); 
			}catch(Exception ex){ 
			System.err.println(ex); 
			} 

		
	}
}
