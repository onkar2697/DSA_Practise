package org.example;

public class StarPattern {
    public void starLeftIncrease(int n){
        for(int i =1;i<=n;i++){
            for(int j= 1 ;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void starReverseLeftIncrease(int n){
        for(int i =n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void starsAtRightSide(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j <= n-  i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void reverseStarsAtRightSide(int n){
        for(int i = n;i >= 1; i--){
            for(int j = 1;j <=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k <= i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
