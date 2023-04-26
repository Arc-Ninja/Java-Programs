import java.io.*;
import java.net.*;
public class client {
    public static void main(String[] args) throws Exception{
        Socket s = new Socket("localhost",7777);
        String smssg = "";
        String cmssg = "";
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        BufferedReader sr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));
        do{
           
            cmssg = sr.readLine();
            System.out.println("Server: "+cmssg);
            System.out.print("Client:");
            smssg = cr.readLine();
            pw.println(smssg);
        }while(!smssg.trim().equalsIgnoreCase("bye") && !cmssg.trim().equalsIgnoreCase("bye"));
        s.close();
        pw.close();
        sr.close();
        cr.close();
    }
    
}