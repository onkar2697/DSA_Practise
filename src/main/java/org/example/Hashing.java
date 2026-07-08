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

    //Leetcode problem
    public int romanToInt(String s) {
        int res=0;
        int n =s.length();

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int preval=0;  // used to check 4/9/14
        for(int i =n-1;i>=0;i--){
            char ch = s.charAt(i);
            int val = map.get(ch);

            if(val < preval){
                res -= val;
            }

            else{
                res += val;
            }
            preval = val;
        }
        return res;
    }

    public String intToRoman(int num) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"I");
        map.put(4,"IV");
        map.put(9,"IX");
        map.put(5,"V");
        map.put(10,"X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");

        StringBuilder sb = new StringBuilder();
        int[] range ={1000,900,500,400,100,90,50,40,10,9,5,4,1};

        for(int i=0;i<range.length;i++){
            while(num >= range[i]){
                sb.append(map.get(range[i]));
                num-=range[i];
            }
        }
        return sb.toString();
    }
}
