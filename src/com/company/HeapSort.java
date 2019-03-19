package com.company;

public class HeapSort {

    public void sort (int listArray[]){


        int heapSize = listArray.length;

        for (int i = heapSize/2-1; i >=0; i --) {
            subtree(listArray, heapSize, i);
        }

        for (int i = heapSize-1; i >=0; i --){
            int excheange = listArray[0];
            listArray[0] =listArray[i];
            listArray[i]= excheange;

            subtree(listArray,i,0);
        }
    }


    void subtree(int listArray[], int heapSize, int i) {

        int maxNumber = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;


        if (left < heapSize && listArray[left] > listArray[maxNumber]) {
            maxNumber = left;
        }
        if (right < heapSize &&listArray[right] > listArray[maxNumber] ){
            maxNumber=right;
        }

        if (maxNumber != i){
            int tmp = listArray[i];
            listArray[i] = listArray[maxNumber];
            listArray[maxNumber] = tmp;

            subtree(listArray,heapSize,maxNumber);

        }
    }
}
