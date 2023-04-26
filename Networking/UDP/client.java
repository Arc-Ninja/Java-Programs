import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws Exception {
        byte[] data = new byte[1024];
        DatagramSocket ds = new DatagramSocket();
        FileInputStream fis = new FileInputStream("send.txt");
        int i=0;
        while(fis.available()!=0){
            data[i] = (byte)fis.read();
            i++;
        }
        fis.close();
        ds.send(new DatagramPacket(data, i,InetAddress.getLocalHost(),1000));
        System.out.println("Sent");
        
        ds.close();
    }
}
