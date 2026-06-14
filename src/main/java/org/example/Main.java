package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        int cnt1 = 0;

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
        st.numericStairs(4);


        InverseArray in = new InverseArray();
        int[] result = in.inverseOfArray(new int[]{1, 3, 0, 2});
        System.out.println(Arrays.toString(result));

        SearchNumber sc =  new SearchNumber();
        boolean ans = sc.searchInArray(new int[]{25,65,47,36,4,14,25,},14);
        boolean ans1 = sc.searchInArray2D(new int[][]{{1,2,3},{25,36,45},{45,26,95}},26);
        System.out.println(ans);
        System.out.println(ans1);

        HashSetAndMap hash = new HashSetAndMap();
        HashMap<Integer,Integer> hm = hash.arrayToHashMap(new int[]{5,65,47,36,4,14,25});
        HashSet<Integer> hs = hash.arrayToHashSet(new int[]{5,65,47,36,4});
        System.out.println(hm);
        System.out.println(hs);

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        ArrayList<Integer> res = hash.countSameNumberInSet(set1, set2);
        System.out.println("the common are "+ res);

        AllString as = new AllString();
        String s = "abcdefg";
        String s1 = "AplPlpA";
        as.reverse(s);
        boolean b = as.isPalindrome(s1);
        System.out.println(b);
        int cnt = as.countUppercase(s1);
        System.out.println(cnt);





    }
}