package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        FactCount cf = new FactCount();
        cf.countOfFact(n);

        ReverseNumber rn = new ReverseNumber();
        rn.reverse(25346);

        DigitCount dc = new DigitCount();
        dc.digitSum(12536);

        PrimeNumber p = new PrimeNumber();
        p.isPrime(12);

        SquareInRange si = new SquareInRange();
        si.PerfectSquare(n);

        StarPattern st = new StarPattern();
        st.starLeftIncrease(4);
        st.starReverseLeftIncrease(4);
        st.starsAtRightSide(4);
        st.reverseStarsAtRightSide(4);

        SubArrays sa = new SubArrays();
        sa.lengthOfSubArray(new int[]{15,25,14,32,47,69},71);
        int ans2= sa.sumOfAllSubArray(new int[]{15,25,14,32,47,69});
        int ans3=sa.sumOfAllSubArray2(new int[]{15,25,14,32,47});
        int ans4=sa.sumOfAllSubArray3(new int[]{15,25,14,32});
        System.out.print(ans2);
        System.out.print(ans3);
        System.out.print(ans4);

        sa.generateSubArrays(new int[]{15,25,14,32,47});

        ArraysProblems ap = new ArraysProblems();
        ap.kthSmallest(new int[]{15,25,14,32,47},2);
        int[] prefixsum = ap.prefixSum(new int[]{15,25,14,32,47});
       for(int num:prefixsum){
           System.out.print(num+" ");
       }


    }
}