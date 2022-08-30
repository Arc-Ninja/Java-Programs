import java.io.*;
public class DataInputStreamPrac {
    public static void main(String[] args) throws IOException{
        try (DataInputStream in = new DataInputStream(new FileInputStream("Test.dat"))) {
            for(int i = 0;i<23;i++) {
                //readLine is not working and I don't know any other way to read from the file
                System.out.print(in.readChar());
            }
            System.out.println("\n");
            System.out.println(in.readBoolean());
            System.out.println("Printed data from file Test.dat");
        }

        catch (FileNotFoundException ex){
            System.out.println("Cannot Open File");
            return;
        }
    }
}