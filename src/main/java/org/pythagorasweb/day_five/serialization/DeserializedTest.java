package org.pythagorasweb.day_five.serialization;

import org.pythagorasweb.day_four.on_class.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializedTest {
    public static void main(String[] args) {
        BasicSerializer basicSerializer = null;

        try (FileInputStream fileIn = new FileInputStream("object.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            basicSerializer = (BasicSerializer) in.readObject();
            System.out.println("Deserialized Person...");
            System.out.println("Age: " + basicSerializer.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
