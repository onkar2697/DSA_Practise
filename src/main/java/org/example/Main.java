package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

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



    }
}