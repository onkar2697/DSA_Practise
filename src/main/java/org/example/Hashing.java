package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Hashing {
    public List<Integer> findCommonElements(int[] arr1, int[] arr2){
        ArrayList<Integer> res=new ArrayList<>();
        int n=arr1.length;
        int m=arr2.length;
        int val; // 1st repeating no
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr1[i])){
                val = arr1[i];
                System.out.println("Repeating number is : " + val);
            }
            map.put(arr1[i],map.getOrDefault(arr1[i],0)+1);
        }
        for(int i=0;i<m;i++){
            if(map.containsKey(arr2[i])){
                res.add(arr2[i]);
            }
        }

        return res;
    }

    public int[] twoSum(int[] arr1, int target){
        int[] res=new int[2];
        int n=arr1.length;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            map.put(arr1[i],i);
        }

        for(int i=0;i<n;i++){
            if(map.containsKey(target-arr1[i])){
                res[0] = map.get(target-arr1[i]); //print the index of the numbers
                res[1] = i;
            }
        }

        return res;
    }


}
