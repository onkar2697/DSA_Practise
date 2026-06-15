package org.example;

public class Recursion {

    public static boolean primeNumber(int n){
        if(n<1) return false;
        if(n==1) return true;

        return isRecPrime(n,2);
    }
    public static boolean isRecPrime(int n, int k){
        if(k*k > n) return true;

        if(n%k == 0) {
            return false;
        }
        return isRecPrime(n,k+1);
    }

    public static int febonaci(int n){
        if(n==0 || n==1) return n;

        return febonaci(n-1)+febonaci(n-2);
    }
}
