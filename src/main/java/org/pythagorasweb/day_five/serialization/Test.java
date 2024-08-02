package org.pythagorasweb.day_five.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test {
    public static void main(String[] args) {
        BasicSerializer basicSerializer = new BasicSerializer("Danso", 5000);

        try (FileOutputStream fileOut = new FileOutputStream("object.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(basicSerializer);
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
