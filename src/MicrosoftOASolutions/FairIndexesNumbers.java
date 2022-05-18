package MicrosoftOASolutions;
import java.io.IOException;
import java.util.*;

/*
You are given two arrays A and B consisting of N integers each.

Index K is named fair if the four sums (A[0] + ... + A[K-1]), (A[k] + ... + A[N-1]), (B[0] + ... + B[k-1]) and (B[K] + ... + B[N-1]) are all equal. In other words, K is the index where the two arrays, A and B, can be split (into two non-empty arrays each) in such a way that the sums of the resulting arrays' elements are equal.

Write a function fairIndex that has two array arguments which given two arrays of integers A and B, returns the number of fair indexes.
 */

public class FairIndexesNumbers {

    class Solution {

        public static int fairIndex(int a[], int b[]) {
            int number_fair_indexes = 0;
            int firstArraySum = 0;
            int secondArraySum = 0;
            //int multiply = 2;

            int arrayTempA = a[0];
            int arrayTempB = b[0];

            for (int i = 0; i < a.length; i++) {
                firstArraySum += a[i];
                secondArraySum += b[i];
            }

            for (int i = 1; i < a.length; i++) {
                if (i != 1 && arrayTempA == arrayTempB && 2 * arrayTempA == firstArraySum && 2 * arrayTempB == secondArraySum) {
                    number_fair_indexes++;
                }
                arrayTempA += a[i];
                arrayTempB += b[i];
            }
            return number_fair_indexes;
        }
    }
}

