package org.example;

public class Sorting {
    public int[] selectionSort(int[]array){
        int n =  array.length;

        for(int i=0;i<n;i++){
            int minIndex = i;

            //with this loop check all elements with existing one
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

    public int[] insertionSort(int[]array){
        int n = array.length;

        // starting from inder 1 to n-1 and we areinserting the value and checking it for every value from j=0-n
        for(int i = 1; i < n; i++){
            int current = array[i];
            int j = i-1;

            while(j>=0 && array[j] > current){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }


}
