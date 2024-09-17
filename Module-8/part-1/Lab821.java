
import java.io.*;

public class Lab821 {
	public static void main(String ar[]) {
		
		try{ 
			File myfile = new File("D:\\MyJLC2.0\\DSA"); 
			System.out.println("\t"+myfile); 
			boolean flag = myfile.exists(); 
			System.out.println("\t DSA exists ? "+flag); 
			boolean x = myfile.mkdirs(); 
			System.out.println("\t DSA Created ? "+x); 
			flag = myfile.exists(); 
			System.out.println("\t DSA exists ? "+flag); 
			x = myfile.mkdirs(); 
			System.out.println("\t DSA Created ? "+x); 
			boolean y = myfile.delete(); 
			System.out.println("\t DSA exists ? "+y); 
			System.out.println(" Done!!! "); 
			}catch(Exception ex){ 
			System.err.println(ex); 
			} 

		
	}
}
