import java.io.*;
import java.util.Scanner;

public class Main {
    public static BufferedReader buffer;

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        String word = "letter";
        boolean isFound = false;

        initDictionary();
    }

    public static void initDictionary() throws IOException {
        try {
            String path = new File(".").getCanonicalPath();
            String dictionaryPath = path + "/src/data.txt";
            File f = new File(dictionaryPath);

            BufferedReader b = new BufferedReader(new FileReader(f));
            buffer = b;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}