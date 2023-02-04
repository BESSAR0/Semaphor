package lessan;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    public Main() throws IOException {
    }

    public static void main(String[] args) throws IOException {
         File file = new File("D:\\Test\\Documet.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int)file.length()];

        fis.read(byteArray);
        String f = null;
        int count = 0;
        for (int i = 0; i < byteArray.length; i++) {
            if (byteArray.length == f.indexOf(224)){
                count++;
            }
        }System.out.println(count);
        BufferedWriter bf = Files.newBufferedWriter(Path.of("D:\\Test\\Documet.txt"),
        StandardOpenOption.TRUNCATE_EXISTING);
        bf.write(count);
        bf.close();
    }
}