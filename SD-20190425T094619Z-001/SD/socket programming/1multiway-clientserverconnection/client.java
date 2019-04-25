
import java.io.*;
import java.net.*; 
public class client
{ 
        public static void main(String[] args) throws IOException 
      {

                Socket clientSock=new Socket("localhost", 3000);//socket creation 
                System.out.println("Client connected to the server");
                //reading from keyboard(keyRead object) 
                BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));
                OutputStream ostream=clientSock.getOutputStream();//communication stream associated with socket 
                //sending message to client (pwrite object)
                PrintWriter pwrite=new PrintWriter(ostream,true);
                InputStream istream=clientSock.getInputStream();
                //receiving from server(receiveRead object) 
                BufferedReader receiveRead=new BufferedReader(new InputStreamReader(istream));
                System.out.println("to Start the chat, type message and press Enter key"); 
                String receiveMessage , sendMessage;
                while(true)
                {
                        sendMessage=keyRead.readLine();//keyboard reading 
                        pwrite.println(sendMessage);//sending to server
                        System.out.flush();
                        if((receiveMessage=receiveRead.readLine())!=null)//receive from server 
                        { 
                                System.out.println("server:>"+receiveMessage);//displaying message
                        } 
                        if(sendMessage.equals("bye"))
                        {
                                break;
                        }
                }
                
        }
}

