
import java.io.*;

public class Lab823 {
	public static void main(String ar[]) {
		
		try{ 
			File mypath = new File("D:\\MyJLC2.0"); 
			File mydir = new File(mypath,"Dsa");
			File myfile = new File(mydir,"hello.java");
			
			System.out.println("\t"+mypath.exists());
			System.out.println("\t"+mydir.exists());
			System.out.println("\t"+myfile.exists());
			
			if(!mydir.exists()) {
				mydir.mkdir();
			}
			
			if(!myfile.exists()) {
				myfile.createNewFile();
			}
			System.out.println("\t after creating");
			System.out.println("\t"+mypath.exists());
			System.out.println("\t"+mydir.exists());
			System.out.println("\t"+myfile.exists());
			
			
			System.out.println(" Done!!! "); 
			}catch(Exception ex){ 
			System.err.println(ex); 
			} 

		
	}
}
