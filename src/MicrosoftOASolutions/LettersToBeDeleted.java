package MicrosoftOASolutions;

/*
In an even word, each letter occurs an even number of times.
Write a function solution that, given a string S consisting of N characters, returns the minimum
number of letters that must be deleted to obtain an even word.

Examples:
1. Given S = "acbcbba", the function should return 1 (one letter b must be deleted).
2. Given S = "axxaxa", your function should return 2 (one letter a and one letter × must be deleted).
3. Given S = "aaaa", your function should return 0 (there is no need to delete any letters).

Write an efficient algorithm for the following assumptions:
N is an integer within the range [0..200,000];
string S consists only of lowercase letters (a-z).

 */

public class LettersToBeDeleted {

    class Solution {
        public int solution(String S) {
            int[] count = new int [55]; // how max size is defined between [0...200k], i had put any number smaller than the maximum
            for (int i = 0; i<S.length(); i++)
                count[S.charAt(i) - 'a']++;


            int lettersToDelete = 0;
            for(int i =0; i<count.length; i++){
                if(count[i] % 2 == 1)
                    lettersToDelete++;
            }
            return lettersToDelete; // the complexity of this algorithm is approximately O(n)
        }

    }


}
