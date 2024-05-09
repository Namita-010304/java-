import java.util.io;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
    public static void main(String[] args) {
        try {
            FileInputStream fp = new FileInputStream("abc.txt");
            int c;
            while ((c = fp.read()) != -1) {
                System.out.print((char) c);
            }
            fp.close(); // Close the FileInputStream when done
        } catch (IOException e) {
            e.printStackTrace(); // Handle IOException if file operation fails
        }
    }
}
