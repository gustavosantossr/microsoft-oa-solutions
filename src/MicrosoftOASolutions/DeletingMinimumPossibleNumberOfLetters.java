package MicrosoftOASolutions;
import java.lang.*;

/*
Given a string S having lowercase English letters (a-z), returns a string with no instances of three identical consecutive letters,
obtained from S by deleting the minimum possible number of letters.
 */


public class DeletingMinimumPossibleNumberOfLetters {

    class Solution {
        public String solution(String S) {
            StringBuilder minimumPossibleLetters = new StringBuilder(); // from java.lang library
            /* getting the first and the second position of a string to compare with the next */
            minimumPossibleLetters.append(S.charAt(0));
            minimumPossibleLetters.append(S.charAt(1));

            for(int i = 2; i<S.length(); i++){
                if(S.charAt(i) != S.charAt(i-1) || S.charAt(i) != S.charAt(i - 2))
                    minimumPossibleLetters.append(S.charAt(i));
            }
            return minimumPossibleLetters.toString(); // return of a String as the question define

        }
    }
}


