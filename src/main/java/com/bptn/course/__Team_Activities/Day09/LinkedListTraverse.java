package com.bptn.course.__Team_Activities.Day09;

import java.util.List;
import java.util.ListIterator;
import java.util.LinkedList;

public class LinkedListTraverse {

    // FREEZE CODE BEGIN
    public static void main(String[] args) {
        long startTime, endTime;
        LinkedList<Integer> list = new LinkedList<Integer>();
        populateList(list, 100000);

        startTime = System.currentTimeMillis();
        traverseList(list);
        endTime = System.currentTimeMillis();

        System.out.println("Time to traverse the list: " + (endTime - startTime) + "ms");

    }

    public static void populateList(List<Integer> list, int elements) {
        for (int i = 0; i < elements; i++)
            list.add(i);
    }
    // FREEZE CODE END

    public static void traverseList(List<Integer> list) {
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }
}