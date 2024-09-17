import java.io.*;
public class Lab815 {
	public static void main(String[] args) {
		Reader rd = null;
		BufferedReader br =null;
		try {
			rd = new FileReader("D:\\mybookstroe\\mynot.txt");
			br = new BufferedReader(rd);
			while(true) {
				String data  = br.readLine();
				if(data == null)
					break;
				System.out.println(data);
				
			}
			
		}catch(Exception ex){
			System.err.println(ex);
			
		}
		finally {
			try {
			if(rd!=null)rd.close();
			if(br!=null)br.close();
			
		}
			catch(Exception ex) {
				
			}

	}
			
	}
	
	
}
