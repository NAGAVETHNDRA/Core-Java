
import java.io.*;

class MyFilter implements FileFilter{

	String str;
	public MyFilter(String str) {
		this.str= str;
	}
	@Override
	public boolean accept(File myfiles1) {
		boolean flag = myfiles1.getName().endsWith(str);
		return flag;
	}
	
	
	
}
public class Lab820 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	try {
		File file = new File("D:\\MyWork\\JLC\\JAVA FSD\\core java\\Module-7\\part-8");
		System.out.println("java files----------");
		File myfiles[] = file.listFiles(new MyFilter("java"));
		System.out.println("total items:"+myfiles.length);
		for(File myfile: myfiles) {
			String fname = myfile.getName();
			System.out.println("\t"+fname);
		}
		
		System.out.println("class files-----------");
		File myfiles1[] = file.listFiles(new MyFilter("class"));
		System.out.println("total items:"+myfiles1.length);
		for(File myfile1: myfiles1) {
			String fname = myfile1.getName();
			System.out.println("\t"+fname);
		}
		System.out.println("done");
		
	}catch(Exception ex) {
		
	}
		
		
	}
}
