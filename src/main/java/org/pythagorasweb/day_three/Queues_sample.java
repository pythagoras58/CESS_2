package org.pythagorasweb.day_three;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues_sample {
    public static void main(String[] args) {

        /*
        *  LinkedList: Can be used as a queue by
        *  utilizing its add, remove, and peek methods.
        * */

        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        System.out.println(queue.peek()); // Outputs: apple
        System.out.println(queue.remove()); // Outputs: apple

        /*
        * PriorityQueue: Orders elements based on their natural
        * ordering or by a custom comparator.
        * */
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("banana");
        priorityQueue.add("apple");
        System.out.println(priorityQueue.peek()); // Outputs: apple
    }
}
