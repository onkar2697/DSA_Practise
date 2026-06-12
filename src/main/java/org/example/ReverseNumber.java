package org.example;

public class ReverseNumber {
    public void reverse(int n ){
        String s = Integer.toString(n);
        for(int i =s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
    }
}
