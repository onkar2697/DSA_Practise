package org.example;

public class InverseArray {
    public int[] inverseOfArray(int[] arr){
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[arr[i]] = i;
        }
        return ans;
    }
}
