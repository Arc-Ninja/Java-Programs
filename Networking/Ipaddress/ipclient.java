import java.net.*;
import java.io.*;
public class ipclient{
    public static void main(String args[]) throws IOException{
        InetAddress addr = InetAddress.getLocalHost();
        System.out.println("IP address: "+addr);

    }
}