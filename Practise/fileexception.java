import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileexception {
    public static void main(String[] args) {
        FileReader file = null;
        try {
            file = new FileReader("example.txt");

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            try {
                if (file != null) {
                    file.close();
                    System.out.println("File closed successfully");
                }
                System.out.println("File not found to be closed");
            } catch (IOException e) {
                System.out.println("Error closing file");
            }
        }

    }
}
