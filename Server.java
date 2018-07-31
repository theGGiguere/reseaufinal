import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(9091);
        Board jeu = new Board();
    	while(true) {
	        Socket socket = listener.accept();
	        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	        int n = 0;
	            while (n<1) {
	                    out.println("Please enter your name :");
	                    n++;
	                }
	         BufferedReader nameR = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	         String name = nameR.readLine();
	         out.println("Your name is : "+name);
	         jeu.init();
	         jeu.paint();
	         out.print(jeu);
        }
    }
}
