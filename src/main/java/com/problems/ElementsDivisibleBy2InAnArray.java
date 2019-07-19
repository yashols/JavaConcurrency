/**
 * Maximum possible elements which are divisible by 2
 * Given an integer array arr of size N. The task is to find the maximum possible
 * elements in the array which are divisible by 2 after modifying the array.
 * One can perform below operation an arbitrary number of times(possibly zero times).
 * https://www.geeksforgeeks.org/maximum-possible-elements-which-are-divisible-by-2/
 */
package com.problems;

public class ElementsDivisibleBy2InAnArray {

    public static void main(String args[]) {
        int[] input = {1,2,3,4,5};
        int maxPossible = 0;
        boolean oddFound = false;
        for(int i=0; i<input.length; ++i) {
            if(input[i] % 2 == 0) {
                ++maxPossible;
                continue;
            }
            if(oddFound) {
                ++maxPossible;
                oddFound = false;
            } else {
                oddFound = true;
            }
        }
        System.out.println(maxPossible);
    }

}
