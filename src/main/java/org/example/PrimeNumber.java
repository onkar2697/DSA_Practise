package org.example;

public class PrimeNumber {
    public void isPrime(int n){
        int cnt =0;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                cnt++;
            }
        }
        if(cnt == 0){
            System.out.println(n + " is a Prime Number");
        }
        else{
            System.out.println(n + " is not a Prime Number");
        }
    }
}
