import java.io.*;
public class streamprac {
    public static void main(String[] args) {
        try{
            String s = "Testing output streams... 1234";
            OutputStream os = new FileOutputStream("testing.txt");
            byte[] ary = s.getBytes();
            os.write(ary);
            System.out.println("Data Written...");
            os.close();
            InputStream is = new FileInputStream("testing.txt");
            byte[] ary1 = new byte[100];
            is.read(ary1);
            String op = new String(ary1);
            System.out.println("Output is: "+op);
            is.close();
        }
        catch(Exception e){
            System.out.println("Error: "+e);
        }
    }
}
