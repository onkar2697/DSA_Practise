package org.example;

public class DigitAndNumber {
    public void digitSum(int n){
        int sum =0;
        while(n>0){
            sum += n%10;
            n = n/10;
        }
        System.out.println("sum of digits of the number is : "+sum);
    }

    public void countOfFact(int n){
        int cnt=0;
        for(int i =1;i<n/2; i++){
            if(n % i == 0){
                cnt++;
            }
        }
        System.out.println("no of factors of :" +n + " are " + cnt);
    }

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

    public void PerfectSquare(int n){
        System.out.print("Perfect Square : ");
        for(int i=1; i<=n/2 ;i++){
            if(i*i < n){
                System.out.print(i*i + " ");
            }
        }
        System.out.println();
    }

    public void reverse(int n ){
        String s = Integer.toString(n);
        for(int i =s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
