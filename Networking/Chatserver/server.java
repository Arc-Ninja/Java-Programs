import java.io.*;
import java.net.*;
public class server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss = new ServerSocket(7777);
        Socket s = ss.accept();
        String smssg = "";
        String cmssg = "";
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        BufferedReader sr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader cr = new BufferedReader(new InputStreamReader(System.in));
        pw.println("Connected to server succesfully!");
        do{
            cmssg = sr.readLine();
            System.out.println("Client: "+cmssg);
            System.out.print("Server:");
            smssg = cr.readLine();
            pw.println(smssg);
        }while(!smssg.trim().equalsIgnoreCase("bye") && !cmssg.trim().equalsIgnoreCase("bye"));
        s.close();
        ss.close();
        pw.close();
        sr.close();
        cr.close();
    }
    
}
