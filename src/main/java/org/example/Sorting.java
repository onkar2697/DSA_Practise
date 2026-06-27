package org.example;

public class Sorting {
    public int[] selectionSort(int[]array){
        int n =  array.length;

        for(int i=0;i<n;i++){
            int minIndex = i;

            for(int j=i+1;j<n;j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            int temp  = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        return array;
    }

    public int[] bubbleSort(int[]array){
        int n = array.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n-1-i; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;

                }
            }
        }
        return array;
    }
}
