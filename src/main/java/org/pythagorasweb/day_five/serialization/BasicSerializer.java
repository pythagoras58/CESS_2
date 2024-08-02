package org.pythagorasweb.day_five.serialization;

import java.io.Serializable;

public class BasicSerializer implements Serializable {

    private static  final  long serialVerionUID = 1L;
    private String name;

    private int age;

    public BasicSerializer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
