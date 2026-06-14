package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        DigitAndNumber number = new DigitAndNumber();
        number.countOfFact(n);
        number.reverse(25346);
        number.digitSum(12536);
        number.isPrime(11);
        number.PerfectSquare(n);

        //Star pattern
        StarPattern st = new StarPattern();
        st.starLeftIncrease(4);
        st.starReverseLeftIncrease(4);
        st.starsAtRightSide(4);
        st.reverseStarsAtRightSide(4);
        st.numericStairs(4);

        //Subarrays problems
        SubArrays sa = new SubArrays();
        sa.lengthOfSubArray(new int[]{15,25,14,32,47,69},71);
        int ans2= sa.sumOfAllSubArray(new int[]{15,25,14,32,47,69});
        int ans3=sa.sumOfAllSubArray2(new int[]{15,25,14,32,47});
        int ans4=sa.sumOfAllSubArray3(new int[]{15,25,14,32});
        System.out.print(ans2);
        System.out.print(ans3);
        System.out.print(ans4);

        sa.generateSubArrays(new int[]{15,25,14,32,47});

        //Arrays Problems
        ArraysProblems ap = new ArraysProblems();
        ap.kthSmallest(new int[]{15,25,14,32,47},2);

        int[] val= ap.inverseOfArray(new int[]{1,3,0,2});
        for(int num:val){
            System.out.print(num);
        }

        boolean isinarray = ap.searchInArray(new int[]{15,25,14,32,47},47);
        boolean isinarray1= ap.searchInArray2D(new int[][]{{15,25,35},{65,55,45},{95,85,75}},75);
        System.out.println(isinarray);
        System.out.println(isinarray1);

        int[] prefixsum = ap.prefixSum(new int[]{15,25,14,32,47});
       for(int num:prefixsum){
           System.out.print(num+" ");
       }

       //String problems
       AllString al = new AllString();
       al.reverse("abcdefg");
       int countupper = al.countUppercase("AbcDeFglsE");
       System.out.println(countupper);
       System.out.println(al.isPalindrome("AlePelA"));

       //Hshmap
        HashSetAndMap hm = new HashSetAndMap();

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Convert array to HashSet
        HashSet<Integer> set1 = hm.arrayToHashSet(arr1);
        HashSet<Integer> set2 = hm.arrayToHashSet(arr2);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        // Convert array to HashMap
        HashMap<Integer, Integer> map = hm.arrayToHashMap(arr1);
        System.out.println("Map: " + map);

        // Find common elements
        ArrayList<Integer> common =
                hm.countSameNumberInSet(set1, set2);

        System.out.println("Common elements: " + common);

    }
}