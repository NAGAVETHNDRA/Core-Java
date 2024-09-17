
import java.io.*;
public class Lab812 {
	public static void main(String[] args) {
		InputStream is = null;
		BufferedInputStream bis = null;
		try {
			is = System.in;
			bis = new BufferedInputStream(is);
			
			System.out.println("enter Data");
			while(true) {
				int mydata = bis.read();
				if(mydata == 13) 
					break;
				char ch=(char)mydata;
				System.out.print(ch);
			}
			
			
		}
		catch(Exception ex){
			System.err.println(ex);
		}
		finally {

			try {
				if(bis!=null)
					bis.close();
			}
			catch(Exception ex){
				
			}
		}
	
	
	
	
	
	
	}
}
