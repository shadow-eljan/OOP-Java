package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileCounter {

    public static void main(String[] args) {

        System.out.print("Please enter filename: ");
        String fileName = "C:\\Users\\eljan\\IdeaProjects\\JavaOOP_A21\\src\\Exception\\narrative.txt";

        int characters = 0;
        int words = 0;
        int lines = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                lines++;
                characters += line.length();
                String[] wordArray = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }
            }

            System.out.println("\nFile " + fileName + " has");
            System.out.println(characters + " characters,");
            System.out.println(words + " words and");
            System.out.println(lines + " lines.");

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}
