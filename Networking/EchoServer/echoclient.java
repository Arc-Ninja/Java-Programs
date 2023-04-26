import java.io.*;
// import java.util.*;
import java.net.*;

public class echoclient {
    public static void main(String[] args) throws IOException {
        String mssg = "";
        Socket s;
        while(!mssg.trim().equalsIgnoreCase("bye")){
            s = new Socket("localhost",8020);
            PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
            System.out.print(" > ");
            // BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
            // buff.readLine();
            pw.println(buff);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            System.out.println(dis.readLine());
            dis.close();
            pw.close();
            // buff.close();
            s.close();
        }
    }
}
