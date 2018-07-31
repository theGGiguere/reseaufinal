import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.*;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;  

public class Client {

    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
        Socket s = new Socket("localhost", 9091);
        BufferedReader input = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedOutputStream out1 = new BufferedOutputStream(new ObjectOutputStream(s.getOutputStream()));
        BufferedInputStream in = new BufferedInputStream(new ObjectInputStream(s.getInputStream()));
        String answer = input.readLine();
        System.out.println(answer);
        String name = sc.next();
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        out.println(name);
        String answerN = input.readLine();
        System.out.println(answerN);
    }
}
