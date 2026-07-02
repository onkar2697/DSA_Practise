package org.example;

import java.util.*;

import static org.example.Recursion.febonaci;
import static org.example.Recursion.primeNumber;


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
        int allevenNumbers = number.allEven(245);
        System.out.println("Number of even numbers: "+allevenNumbers);
        int oddsum = number.oddSum(27);
        System.out.println("sum of odd numbers: "+oddsum);

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

        ap.reverseArray(new int[]{15,25,14,32,47});

        boolean isinarray = ap.searchInArray(new int[]{15,25,14,32,47},47);
        boolean isinarray1= ap.searchInArray2D(new int[][]{{15,25,35},{65,55,45},{95,85,75}},75);
        System.out.println(isinarray);
        System.out.println(isinarray1);

        int[] prefixsum = ap.prefixSum(new int[]{15,25,14,32,47});
       for(int num:prefixsum){
           System.out.print(num+" ");
       }
        System.out.println("Roate Array:");
       int[] rotate = ap.rotate(new int[]{12,20,14,16,13,15},3);
       for(int i:rotate){
           System.out.print(i+" ");
       }
       System.out.println("AddValue to  Array:");
       int[] addVal = ap.addValInArray(new int[]{0,0,0,0,0,0,0,0,0,0},2,2,6);
       for(int i:addVal){
           System.out.print(i+" ");
       }
       int cost = ap.costToRemoveElements(new int[]{1,5,3,6,4,7,9});
       System.out.println("the cost to remove element is: " + cost);

       //String problems
       AllString al = new AllString();
       al.reverse("abcdefg");
       int countupper = al.countUppercase("AbcDeFglsE");
       System.out.println(countupper);
       System.out.println(al.isPalindrome("AlePelA"));
       System.out.println(al.countSpecialCases("ab_hy%ggh$h"));
       int countag = al.countAGpairs("agjikhjhgagmkjagnga");
       System.out.println("count of ag pair as : " +countag);

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


        if(primeNumber(11)){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not Prime number");
        }
        int n1 =10;
        System.out.println("Febonacci series : ");
        for(int i=0;i<n1;i++){
            System.out.print(febonaci(i)+" ");
        }

        Matrix matrix = new Matrix();
        int[][] mat = matrix.transposeOfMatrix(new int[][]{
                {15,16,17},
                {24,25,26},
                {35,36,37}
        });
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        TappingOfRainWater t =  new TappingOfRainWater();
        int tapwater = t.tapWater(new int[]{4,2,0,3,2,5});
        System.out.println("rain water tapped is : " +tapwater);

        Sorting sort = new Sorting();
        int[] sortedArray = sort.selectionSort(new int[]{15,25,10,12,9,30,18});
        System.out.println("sorted array is :" + Arrays.toString(sortedArray));
        for(int num:sortedArray){
            System.out.print(num+" ");
        }
        int[] sortedArray1 = sort.bubbleSort(new int[]{15,25,10,12,9,30,18});
        System.out.println("sortedArray is :" + Arrays.toString(sortedArray1));

        int[] sortedArray2 = sort.insertionSort(new int[]{5,3,8,1,2,9});
        System.out.println("sortedArray is :" + Arrays.toString(sortedArray2));

        //Hasing

        Hashing hash = new Hashing();
        List<Integer> commonElemet = hash.findCommonElements(new int[]{10,12,15,14,16,18,12,20,20},new int[]{18,15,68,13,17,19,11,20,16});
        System.out.println("common elements is : " + commonElemet.toString());

        int[] twoSum = hash.twoSum(new int[]{10,12,24,11,15},25);
        System.out.println("the two sum index is " + Arrays.toString(twoSum));
        for(int num:twoSum){
            System.out.print(num+" ");
        }

    }
}