
import java.io.*;
public class Lab814 {
	public static void main(String[] args) {
		Reader rd=null;
		BufferedReader br = null;
		try {
			rd = new InputStreamReader(System.in);
			br = new BufferedReader(rd);
			System.out.println("enter cid");
			String cid = br.readLine();
			
			System.out.println("enter cname");
			String cname = br.readLine();
			
			System.out.println("enter cemail");
			String email = br.readLine();
			
			System.out.println(cid+"\t"+cname+"\t"+email);
			
			
			
		}catch(Exception ex) {
			System.err.println(ex);
		}
		finally {
			try {
				if(rd!=null)
					rd.close();
				if(br!=null)
					br.close();
				
			}catch(Exception ex) {
				
			}
		}
	


	
	
	
	
	
	}
}
