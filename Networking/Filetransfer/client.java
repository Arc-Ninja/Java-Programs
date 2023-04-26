import java.io.*;
import java.net.*;

public class client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost",7777);
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        FileReader fr = new FileReader("send.txt");
        char[] data = new char[30];
        int ch;
        for(int i=0;i<100;i++){
            if((ch=fr.read())!=-1){
            data[i] = (char)ch; 
            }
            else{
                break;
            }
        }
        StringBuilder strdat = new StringBuilder("");
        strdat.append(data);
        System.out.println(strdat);
        pw.println(strdat);
        pw.close();
        fr.close();
        s.close();
    }
}
