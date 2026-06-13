package org.example;

public class AllString {
    public void reverse(String s){
        for(int i =s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }

    public boolean isPalindrome(String s){
        char[] arr = s.toCharArray();
        int n = arr.length-1;
        int i=0;
        while(i<n){
            if(arr[i] != arr[n]){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }

    public int countUppercase(String s){
        int n = s.length();
        int cns=0;

        for(int i=0;i<n;i++){
            if(s.charAt(i)>='A'&&s.charAt(i)<='Z'){
                cns++;
            }
        }
        return cns;
    }

}
