import java.io.*;
import java.util.*;


public class pingserver {
    public static void main(String[] args) throws Exception{
        Process p = Runtime.getRuntime().exec("tracert www.google.com");
        BufferedReader buff = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String s="";
        while((s=buff.readLine())!=null){
            System.out.println(s);
        }
        Date d = new Date();
        System.out.println(new Date());

    }
}
