package com.problems;

import java.util.*;
import java.lang.*;
public class ReverseAnArrayOfNumbers
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        while(testcases-- > 0) {
            ArrayList<Integer> inputArray = new ArrayList<Integer>();

            int elementsInArray = sc.nextInt();

            // Looping for queries
            while (elementsInArray-- > 0) {
                int number = sc.nextInt();
                inputArray.add(number);

            }
            reverseArray(inputArray);
        }
    }

    private static void reverseArray(ArrayList<Integer> inputArray) {
        Collections.reverse(inputArray);
        for(int print =0; print < inputArray.size(); ++print) {
            System.out.print(inputArray.get(print) + " ");
        }
    }
}