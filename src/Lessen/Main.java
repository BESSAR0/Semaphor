package Lessen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String longest;
        Scanner scanner = new Scanner(System.in);
        longest = scanner.nextLine();
        scanner.close();


        for (int i = 0; i < longest.length(); i++) {
            if (longest.length() > 5) {
                if (Files.exists(Path.of("D:\\Test\\Documet.txt"))) {
                    try (FileWriter write = new FileWriter("D:\\Test\\Documet.txt")) {
                        write.write(longest);
                        write.flush();
                    } catch (IOException ioException) {
                        System.out.println(ioException.getMessage());
                    }
                }

            }
        }
    }
}
