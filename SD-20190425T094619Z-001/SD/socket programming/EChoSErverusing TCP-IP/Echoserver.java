import java.net.*;
import java.io.*;
public class Echoserver 
{
	public static void main( String args[]) throws Exception
	{
		ServerSocket srs = new ServerSocket(1234);
		System.out.println("Server is running...");
		Socket ss=srs.accept();
		System.out.println("connection establised");
		BufferedReader br = new BufferedReader(new InputStreamReader(ss.getInputStream()));
		DataOutputStream dos = new DataOutputStream(ss.getOutputStream());

 while(true)
 {
   String s2; 
  while((s2=br.readLine())!=null)
  {
 	System.out.println("server send echo to client ");
 	dos.writeBytes(s2+"\n");
  }
  System.out.println("Terminated..");
  ss.close(); 
  srs.close();
  dos.close();
  System.exit(0);
  }
 }
}
