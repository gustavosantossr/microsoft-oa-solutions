package MicrosoftOASolutions;
import java.util.*;
import java.lang.*;

/*
There are N blocks, numbered from O to N-1, arranged in a row.
A couple of frogs were sitting together on one block when they had a terrible quarrel.
Now they want to jump away from one another so that the distance between them will be as large as possible.
The distance between blocks numbered J and K. where J < K. is computed as K - J + 1.
The frogs can only jump up, meaning that they can move from one block to another only if the two blocks are adjacent and the second block is of the same or greater height as
the first. What is the longest distance that they can possibly create between each other, if they also chose to sit on the optimal starting
block initially?
Write a function that, given an array blocks consisting of N integers denoting the heights of the blocks,
returns the longest possible distance that two frogs can make between each other starting from one of the blocks.

 */


public class LongestPossibleDistanceForTwoFrogs {

    class Solution {
        public int solution(int[] blocks) {

        /* I'm using an brute force algorithm in this case exactly because I need to test all the possibilities
         from 0 to N-1 */
            int longest_distance = 0; // starts with [0... N-1]

            for(int i=0; i<blocks.length; i++){
                int left = i, right = i; // define the sides of blocks in the initial positions on the blocks
                while((left-1 >= 0) && (blocks[left] <= blocks[left-1]))
                    left--;

                while((right+1 < blocks.length) && (blocks[right] <= blocks[right+1]))
                    right++;

                longest_distance = Math.max(longest_distance, right - left + 1); //using Math library from Java.Lang to return the max distance for TWO frogs
            }
            return longest_distance;
            // that return and the algorithm complexity is approximately O(n*2)
        }
    }

}
