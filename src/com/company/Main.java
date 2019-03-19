package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static HeapSort heapSortList = new HeapSort();

    public static void main(String[] args) {

        int arrayOfNumbers[] = {12, 20, 15, 29, 23, 17, 22, 35, 40, 26, 51, 19};
        int sizeOfArray = arrayOfNumbers.length;

        System.out.println("Lista przed posortowaniem: ");
        for (int i = 0; i < sizeOfArray; ++i) {
            System.out.print (arrayOfNumbers[i] + " ");

        }
        System.out.println("");

        heapSortList.sort(arrayOfNumbers);

        System.out.println("Lista posortowana: ");
        for (int i = 0; i < sizeOfArray; i++) {
            System.out.print(arrayOfNumbers[i] + " ");

        }

    }
}
