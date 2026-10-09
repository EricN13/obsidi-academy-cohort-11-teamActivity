package com.bptn.course.__Team_Activities.Day09;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

public class LinkedListMerge {

    public static void main(String[] args) {

    }

    public static LinkedList<Integer> merge(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        //Merge the two lists
        LinkedList<Integer> mergedList = new LinkedList<>(list1);
        mergedList.addAll(list2);
        //Sort the merged list  
        Collections.sort(mergedList);
        return mergedList;
    }

    // FREEZE CODE BEGIN
    public static void populateList(LinkedList<Integer> list, int elements) {
        Random rand = new Random();

        for (int i = 0; i < elements; i++)
            list.add(rand.nextInt(100));
    }
    // FREEZE CODE END

}
