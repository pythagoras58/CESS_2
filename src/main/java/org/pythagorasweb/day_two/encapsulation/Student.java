package org.pythagorasweb.day_two.encapsulation;

public class Student {
    // Private variables
    private String name;
    private String index_number;
    private int age;

    // Generate constructor

    public Student(String name, String index_number, int age) {
        this.name = name;
        this.index_number = index_number;
        this.age = age;
    }


    // Generate getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIndex_number() {
        return index_number;
    }

    public void setIndex_number(String index_number) {
        this.index_number = index_number;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
