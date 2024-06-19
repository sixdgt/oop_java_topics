package thirdsem.io.example;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputOutputExample {
    public static void main(String[] args) {
        // reading file content
//        String dc_url = "C:/Users/flaw-/Documents/CountryInfo.txt"; // file url or directory
        String url = "C:/Users/flaw-/Documents/NetBeansProjects/UnitEightExample/src/thirdsem/io/example/CountryInfo.txt";
        try {
            File file = new File(url);
            FileInputStream fi = new FileInputStream(file);
//            FileInputStream fi1 = new FileInputStream(new File(url));
            int n = 0;
            while((n = fi.read()) != -1){
                System.out.print((char)n);
            }
            fi.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
