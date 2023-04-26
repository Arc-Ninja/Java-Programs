import java.net.*;
import java.io.*;


public class server {
    public static void main(String[] args) throws Exception{
        
    ServerSocket ss = new ServerSocket(7777);
    Socket s = ss.accept();
    BufferedReader buff = new BufferedReader(new InputStreamReader(s.getInputStream()));
    String data = buff.readLine();
    System.out.println(data);
    FileWriter fw = new FileWriter("Received.txt");
    for(int i=0;i<data.length();i++){
        fw.write(data.charAt(i));
    }
    System.out.println("Successfully Written");
    fw.close();
    buff.close();
    s.close();
    ss.close();
}
}
