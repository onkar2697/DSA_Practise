package org.example;

public class FactCount {
    public void countOfFact(int n){
        int cnt=0;
        for(int i =1;i<n/2; i++){
            if(n % i == 0){
                cnt++;
            }
        }
        System.out.println("no of factors of :" +n + " are " + cnt);
    }
}
