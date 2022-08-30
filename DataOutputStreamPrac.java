import java.io.*;
public class DataOutputStreamPrac {
    public static void main(String[] args) throws IOException{
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("Test.dat"))) {
            out.writeChars("Testing this package...");
            out.writeBoolean(true);
            System.out.println("Written in file Test.dat");
        }

        catch (FileNotFoundException ex){
            System.out.println("Cannot Open File");
            return;
        }
    }
}
