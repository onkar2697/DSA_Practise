package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashSetAndMap {
    public  HashSet<Integer> arrayToHashSet(int []arr){
        HashSet hs = new HashSet();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        return hs;
    }
    public HashMap<Integer,Integer> arrayToHashMap(int []arr){
        HashMap hm = new HashMap();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],i);
        }
        return hm;
    }

    public ArrayList<Integer> countSameNumberInSet(HashSet<Integer> set1,HashSet<Integer> set2){
        ArrayList<Integer> l = new ArrayList<>();
       for(int num:set1){
           if(set2.contains(num)){
               l.add(num);
           }
       }
       return l;
    }

}
