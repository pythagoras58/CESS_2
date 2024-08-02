package org.pythagorasweb.day_three;

import java.util.Stack;

public class Stacks_sample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("apple");
        stack.push("banana");
        System.out.println(stack.peek()); // Outputs: banana
        System.out.println(stack.pop()); // Outputs: banana
    }
}
