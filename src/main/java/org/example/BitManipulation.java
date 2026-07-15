package org.example;

public class BitManipulation {
    public int numberOf1Bits(int n){  // leetcode
        int count =0;

        for(int i=0;i<32;i++){
            if((n&(1<<i))>0){
                count++;
            }
        }
        return count;
    }
}
