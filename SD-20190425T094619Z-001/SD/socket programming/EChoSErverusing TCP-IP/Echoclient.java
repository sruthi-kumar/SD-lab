import java.net.*;
import java.io.*;
public class Echoclient 
{
	public static void main( String args[]) throws Exception
	{
	Socket cs = new Socket("localhost",1234);
	BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
	BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
	DataOutputStream dos = new DataOutputStream(cs.getOutputStream());

	System.out.println(" Enter text..");
	System.out.println(" if client 'quit' type  exit");
	  
	String s1,s3=null; 
	while(!(s1=kb.readLine()).equals("exit"))
	{
		//System.out.println(" data  send to server machine");
	 	dos.writeBytes(s1+"\n");
		s3 = br.readLine();
		//System.out.println(" data  receive from  server machine");
		System.out.println("Server said : "+s3);
		System.out.println("Enter text ");
	}
		System.out.println("Terminated..");
		cs.close(); 
		dos.close();
		kb.close();
	}
}
