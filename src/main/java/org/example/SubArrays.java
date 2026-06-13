package org.example;

public class SubArrays {
    public void generateSubArrays(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<=arr.length-1;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
    public int sumOfAllSubArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){  //can optimise it in n2 by using sliding window
                    sum+=arr[k];

                }
            }
        }
        return sum;
    }

    public void lengthOfSubArray(int[] arr, int n){

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==n){
                    System.out.println("length: " + (j-i+1));
                }
            }
        }
    }

    public int sumOfAllSubArray2(int[] arr){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            int currentsum =0;
            for(int j=i;j<arr.length;j++){
                currentsum+=arr[j];
                totalsum+=currentsum;
            }
        }
        return totalsum;
    }

    public int sumOfAllSubArray3(int[] arr){
        int totalsum=0;
        for(int i=0;i<arr.length;i++){
            //using contribution technique
            //each digit comes how many times in subarrays = (i+1) *(n-i)
            totalsum += arr[i] * (i+1) * (arr.length-i);
        }
        return totalsum;
    }
}
