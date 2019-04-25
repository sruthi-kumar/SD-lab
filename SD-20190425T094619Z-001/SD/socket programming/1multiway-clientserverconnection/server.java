
import java.io.*; 
import java.net.*; 
class server
{ 
        public static void main(String[] args) throws IOException
        {
                ServerSocket serverSock=new ServerSocket(3000);//server socket creation
                System.out.println("waiting for client.........");
                Socket socket=serverSock.accept();//listening client connection and accept the connection
                System.out.println("client connected ");
                BufferedReader keyRead=new BufferedReader(new InputStreamReader(System.in));//reading from keyboard(keyRead object) 
                OutputStream ostream=socket.getOutputStream();//sending to client
                PrintWriter pw=new PrintWriter(ostream,true); 
                InputStream istream=socket.getInputStream();//receiving from server(istream object)
                BufferedReader receiveRead=new BufferedReader(new InputStreamReader(istream));//Stream for receiving data from client
                String receiveMessage,sendMessage;
                while(true)
                {
                        if((receiveMessage=receiveRead.readLine())!= null)
                        {
                                System.out.println("client:>"+ receiveMessage);//receive the message from client
                        }

                        sendMessage=keyRead.readLine();
                        pw.println(sendMessage);
                        System.out.flush();//flush the Stream
                        if(sendMessage.equals("bye"))
                        {
                                break;
                        }       
                }
        }
}

