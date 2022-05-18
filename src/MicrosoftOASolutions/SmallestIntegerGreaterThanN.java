package MicrosoftOASolutions;

/*
Write a function that, given an integer N, returns the smallest integer greater than N,
the sum of whose digits is twice as big as the sum of digits of N.

Examples: 1. Given N = 14, the function should return 19.
The sum of digits of 19 (1 +9 = 10) is twice as big as sum of digits of 14 (1 + 4 = 5).
2. Given N = 10, the function should return 11.
3. Given N = 99, the function should return 9999.

 */

public class SmallestIntegerGreaterThanN {

    class Solution {
        public int solution(int N) {
            int result = 0;
            int valueExpected = doSum(N) * 2;
            for(int i= N; ; i++){
                if(doSum(i) == valueExpected){
                    result = i;
                    break;
                    // I must confess that using "break" in a "if/else" is terrible, but it make the return of solution in the correct way and passing all tests
                }
            }
            return result;
        }

        public static int doSum(int number){
            int sum = 0;
            while(number != 0){
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }

    }


}
