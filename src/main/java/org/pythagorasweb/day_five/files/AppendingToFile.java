package org.pythagorasweb.day_five.files;

import java.io.FileWriter;
import java.io.IOException;

public class AppendingToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt", true); // 'true' for append mode
            writer.write("\nAppending new content.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
