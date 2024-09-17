
import java.io.*;

public class Lab824 {
	public static void main(String ar[]) {
		
		try{ 
			File mypath = new File("D:\\MyJLC2.0"); 
			File mydir = new File(mypath,"Dsa");
			File myfile = new File(mydir,"hello.java");
			
			System.out.println("\t"+mypath.exists());
			System.out.println("\t"+mydir.getAbsolutePath());
			System.out.println("\t"+myfile.getCanonicalPath());
			System.out.println("\t"+mypath.canRead());
			System.out.println("\t"+mypath.lastModified());
			System.out.println("\t"+mypath.getParent());
			System.out.println("\t"+mypath.hashCode());
			System.out.println("\t"+mypath.canWrite());
			myfile.setReadOnly();
			System.out.println("\t"+mypath.canWrite());
			System.out.println("\t"+mypath.canRead());
			
			System.out.println(" Done!!! "); 
			}catch(Exception ex){ 
			System.err.println(ex); 
			} 

		
	}
}
