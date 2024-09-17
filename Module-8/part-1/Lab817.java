import java.io.*;
public class Lab817 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		FileReader fr = null;
		BufferedReader br =null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			
			fr = new FileReader("D:\\mybookstroe\\hai.txt");
			br = new BufferedReader(fr);
			fw = new FileWriter("D:\\mybookstroe\\mynot.txt",true);
			bw = new BufferedWriter(fw);
			
			while(true) {
				String mydata =br.readLine();
				System.out.println(mydata);
				if(mydata == null) break;
				bw.write(mydata);
				bw.newLine();
			}
			bw.flush();
			System.err.println("Done");
			
			
		}catch(Exception ex) {
			System.err.println(ex);
		}
		finally {
			try {
				if(fr!=null)fr.close();
				if(br!=null)br.close();
				if(fw!=null)fw.close();
				if(bw!=null)bw.close();
				
			}catch(Exception ex) {
				
			}
		}
		
		
		
	}
}
