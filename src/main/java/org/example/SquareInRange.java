package org.example;

public class SquareInRange {
    public void PerfectSquare(int n){
        System.out.print("Perfect Square : ");
        for(int i=1; i<=n/2 ;i++){
            if(i*i < n){
                System.out.print(i*i + " ");
            }
        }
        System.out.println();
    }
}
