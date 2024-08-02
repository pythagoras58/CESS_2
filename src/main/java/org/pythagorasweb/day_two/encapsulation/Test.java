package org.pythagorasweb.day_two.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Yahya", "2932839211", 19);
        student.setName("Taha");

        System.out.println(student.getName());
    }
}
