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
}
