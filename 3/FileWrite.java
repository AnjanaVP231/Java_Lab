import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {

        try {

            FileWriter fw = new FileWriter("sample.txt");

            fw.write("Hello Students\n");
            fw.write("This is a file handling example in Java.");

            fw.close();

            System.out.println("File written successfully");

        }

        catch(IOException e) {

            System.out.println("Error occurred");

        }
    }
}
