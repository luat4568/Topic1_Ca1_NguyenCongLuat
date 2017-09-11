import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket echoSocket = null;
        PrintWriter out = null; //send
        BufferedReader in = null;
        try {
            echoSocket = new Socket("127.0.0.1", 10007);
            out = new PrintWriter(echoSocket.getOutputStream(), true);
        } catch (UnknownHostException e) {
        } catch (IOException e) { }
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		System.out.print ("input: ");
		userInput = stdIn.readLine();
		out.println(userInput);
		//Dong cac ket noi
		out.close();
		in.close();
		stdIn.close();
		echoSocket.close();
    }
}