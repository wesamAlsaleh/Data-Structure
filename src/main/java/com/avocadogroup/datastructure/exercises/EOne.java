package com.avocadogroup.datastructure.exercises;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EOne {
    /**
     * Rotate the array based on the provided position.
     *
     * @param ar Array if integers
     * @param d  Positions to rotate
     * @param n  Size of the array.
     */
    public static int[] rotate(int[] ar, int d, int n) {
        // check if the d is less than the length
        d = d % ar.length;

        reverse(ar, 0, n - 1); // reverse the whole array
        reverse(ar, 0, d - 1); // reverse the left numbers (0 -> d - 1)
        reverse(ar, d, n - 1); // reverse the right numbers (d -> n - 1)

        // return the rotated array
        return ar;
    }

    /**
     * Reverse the provided array using two pointers method. O(n)
     *
     * @param ar    Array if integers to reverse.
     * @param left  the start pointer location.
     * @param right the end pointer location.
     */
    private static void reverse(int[] ar, int left, int right) {
        // until they meet
        while (left < right) {
            // swap the left with the right
            int temp = ar[left];
            ar[left] = ar[right];
            ar[right] = temp;

            // update the pointers location
            left++;
            right--;
        }
    }
}
