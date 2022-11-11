import java.io.*;

public class ReaderWriterprac {
    public static void main(String[] args) {
        try{
            Writer we = new FileWriter("testing_2.txt");
            we.write("Testing reader writer classes....");
            we.close();
            System.out.println("Written into file.");
            Reader re = new FileReader("testing_2.txt");
            int data = re.read();
            while(data != -1){
                System.out.print((char)data);
                data = re.read();
            }
            re.close();
        }
        catch(Exception e){
            System.out.println("Error: "+ e);
        }
    }
}
