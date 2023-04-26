import java.io.*;
import java.net.*;


public class server {
    public static void main(String[] args) throws Exception{
        byte[] data = new byte[2048];
        DatagramSocket ds = new DatagramSocket(1000);
        DatagramPacket dp = new DatagramPacket(data,data.length);
        FileOutputStream fos = new FileOutputStream("received.txt");
        ds.receive(dp);
        String str = new String(dp.getData());
        System.out.println(str);
        fos.write(str.getBytes());
        System.out.println("Received");
        fos.close();
        ds.close();
        
    }
    
}
