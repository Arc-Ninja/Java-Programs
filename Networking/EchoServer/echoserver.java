import java.io.*;
import java.net.*;
import java.util.*;

public class echoserver {
    public static void main(String[] args) throws IOException{
        String mssg = "";
        Socket s;
        ServerSocket ss = new ServerSocket(8020);
        while(!mssg.trim().equalsIgnoreCase("bye")){
        s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        mssg = dis.readLine();
        System.out.println(mssg);
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        pw.println("Got:" + mssg);
        dis.close();
        pw.close();
        s.close();
        }
        ss.close();

    }
    
}
