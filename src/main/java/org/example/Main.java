package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        BubbleSort bubbleSort = new BubbleSort();
        List<Comparable> unsortedList = Arrays.asList(1,4,5,6,8,3,8);
        bubbleSort.sort(unsortedList);
        System.out.println(unsortedList);
    }
}