
import java.io.*;
public class Lab816 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:\\mybookstroe\\mynot.txt");
			fos = new FileOutputStream("D:\\mybookstroe\\mynot.txt",true);
			fos = new FileOutputStream("D:\\mybookstroe\\mynot.txt",false);
			while(true) {
				int asc = fis.read();
				if(asc == -1) break;
				fos.write(asc);
			}
			System.out.println("Done");
			
			
			
		}
		catch(Exception ex) {
			System.err.println(ex);
		}
		
		finally{
			try {
				if(fis!=null) fis.close();
				if(fos!=null) fos.close();
				
			}
			catch(Exception ex) {
				
			}
			
		}
			
	}
	
	
}
