
import java.io.*;
public class Lab818 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		try {
			File[] myfiles = File.listRoots();
			System.out.println(myfiles.length);
			for(File myfile : myfiles) {
				long total = myfile.getTotalSpace();
				total = total/1024/1024/1024;
				long free = myfile.getFreeSpace();
				free = free/1024/1024/1024;
				long usble = myfile.getUsableSpace();
				usble = usble/1024/1024/1024;
				
				System.out.println("\t"+myfile+"\t"+total+"\t"+free+"\t"+usble);
			}
			System.out.println("done");
			
			
		}catch(Exception ex) {
			System.err.println(ex);
		}
		
		
	}
}
