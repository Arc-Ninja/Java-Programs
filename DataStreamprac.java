import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamprac {
    public static void main(String[] args) {
        try{
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("testing_1.txt"));
            dos.writeChars("Testing DataStreams...");
            System.out.println("Written....");
            dos.close();
            DataInputStream ios = new DataInputStream(new FileInputStream("testing_1.txt"));
            byte[] ary = new byte[100];
            ios.read(ary);
            String op = new String(ary);
            System.out.println(op);
            ios.close();
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
}
