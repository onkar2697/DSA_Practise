package org.example;

public class DigitCount {
    public void digitSum(int n){
        int sum =0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("sum of digits of the number is : "+sum);
    }
}
