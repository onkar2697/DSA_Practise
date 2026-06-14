package org.example;

import java.util.Arrays;

public class ArraysProblems {
    public int[] prefixSum(int[] arr){
        int[] ans = new int[arr.length];
        int sum=0;
        ans[0]=arr[0]; //no need of using sum
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
            ans[i] = sum;
            // or ans[i] = ans[i-1]+arr[i];
        }
        return ans;
    }

    public void  kthSmallest(int[] arr, int k){
        //sort array and get the smallest one
        Arrays.sort(arr);
        System.out.println("Smallest no is: " + arr[k - 1]);
        System.out.println("Largest no is: " + arr[arr.length - k]);
    }
    public Boolean searchInArray(int[] array, int n) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                return true;
            }
        }
        return false;
    }


    public boolean searchInArray2D(int[][] array, int n){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] == n){
                    return true;
                }
            }
        }
        return false;
    }
    public int[] inverseOfArray(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]] = i;
        }
        return ans;
    }
}
