package com.thoughtfocus.bubblesort;

public class Main {
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int arr[] = {60,87,55, 1, 14, 110, 90};
        ob.bubbleSort(arr);
        System.out.println("Sorting completed");
        ob.printArray(arr);
    }

}
