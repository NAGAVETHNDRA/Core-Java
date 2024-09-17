
import java.io.*;
public class Lab819 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		try {
			File file = new File("D:\\mybookstroe");
			File myfiles[] = file.listFiles();
			System.out.println("Total items : "+myfiles.length);

			for(File myfile : myfiles) {
				
				String fname = myfile.getName();
				boolean dir = myfile.isDirectory();
				boolean fil = myfile.isFile();
				boolean hid = myfile.isHidden();
				
				System.out.println("\t"+fname+"\t"+dir+"\t"+fil+"\t"+hid);
			}
			System.out.println("done");
			
			
		}catch(Exception ex) {
			System.err.println(ex);
		}
		
		
	}
}
