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
    public void reverseArray(int[] arr){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
        for(int k : arr){
            System.out.print(k+" ");
        }
    }
    public int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        return arr;
    }

    public void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public int[] addValInArray(int[] arr, int val, int i, int j) {
        if((i>j) || (i>arr.length) || (j>arr.length)){
            System.out.println("Error invalid input");
        }
        for(int k=i-1;k<j-1;k++){
            arr[k]=arr[k]+val;
        }
        return arr;
    }

    public int costToRemoveElements(int[] arr){
        //pipe problem where cost of pipe have to calculated
        int n =  arr.length;
        //soft array
        Arrays.sort(arr);
        int sum =0;
        int cost=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i=n-1;i>0;i--){
            cost += sum-arr[i];
            sum-=arr[i];
        }
        return cost;
    }

    public int removeDublicates(int[] arr){
        int n = arr.length;
        int ans =0;
        Arrays.sort(arr);  // Array is sorted - Leetcode problm

        if(n==0) return 0;

        for(int i=0;i<n-1;i++){
            if(arr[i] != arr[i+1]){
                ans++;
               // arr[ans]=arr[i];   // in leetcode problem using this to print the number at ith position
            }

        }
        return ans+1;
    }

    public int removeDubTwoRep(int[] arr){  // Leetcode problem

        int n = arr.length;
        int j =1;
        int dub = 1;

        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]){
                dub++;
            }
            else{
                dub =1;
            }
            if(dub <=2){
                arr[j] = arr[i];  // 2 dublicated are allowed
                j++;
            }
        }
        return j;
    }

    public int[] productOfArrayExceptSelf(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int product = 1;

        for(int i=0;i<n;i++){
            product *= arr[i];
        }
        for(int i=0;i<n;i++){
            ans[i] = product/arr[i];
        }
        return ans;
    }

    public int totalProfit(int[] arr){
        int n = arr.length;
        int profit =0;

        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]){
                profit += arr[i]-arr[i-1];
            }
        }
        return profit;
    }

    public int bestTimeToBuyStock(int[] arr){
        int profit =0;
        int n = arr.length;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] - min >profit ){
                profit = arr[i] - min;
            }
        }
        return profit;
    }

}
