import java.net.*; 
import java.io.*; 

public class EchoServer 
{ 
 public static void main(String[] args) throws IOException{ 
    ServerSocket serverSocket = null; 
    try { 
        serverSocket = new ServerSocket(10007); 
	}catch (IOException e) {}

    Socket clientSocket = null; 
    System.out.println ("Waiting for connection.....");

    try { 
         clientSocket = serverSocket.accept(); 
	}catch (IOException e) {}
    System.out.println ("Connection successful");
    System.out.println ("Waiting for input.....");
    BufferedReader in = new BufferedReader(new InputStreamReader( clientSocket.getInputStream())); 

    String inputLine; 
    inputLine = in.readLine();   
    System.out.println ("Server: " + inputLine); 
    
    in.close(); 
    clientSocket.close(); 
    serverSocket.close(); 
   } 
} 
