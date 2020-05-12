import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOTest {
    public static void main(String[] args) {
        try {

            //If file with same name is exist -> do nothing
            //else creat file and call methods

            File file = new File("TestIO.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            if (!Files.exists(Paths.get("TestNIO.txt"))) {
                Files.createFile(Paths.get("TestNIO.txt"));
            }
        } catch (IOException e) {
            System.out.println(e);;
        }

        stringAddToFileIO("Hello, IO World!\n", "TestIO.txt");
        stringAddToFileNIO("Hello, NIO World!\n", "TestNIO.txt");
    }

    // IO Part of the adding string to the end of file;
    public static void stringAddToFileIO(String str, String file) {
        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(str);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //NIO part of the adding string to the end of file;
    public static void stringAddToFileNIO(String str, String file) {
        try {
            Files.write(Paths.get(file), str.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
