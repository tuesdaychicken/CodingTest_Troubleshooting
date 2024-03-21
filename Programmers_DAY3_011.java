package CodingTest_Troubleshooting;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
문제설명
    길이가 같은 두 문자열 str1과 str2가 주어집니다.
    두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 
    한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
   
제한사항
    1 ≤ str1의 길이 = str2의 길이 ≤ 10
    str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
   
입출력 예
    str1	    str2	    result
    "aaaaa"     "bbbbb"	    "ababababab"
 */

public class Programmers_DAY3_011 {

    class Solution {
        public String solution(String str1, String str2) {
            String[] answer = null;

            String[] str_1 = str1.split("");
            String[] str_2 = str2.split("");

            for(int i = 0; i< str_1.length + str_2.length; i++){
                answer[i] = str_1[i] + str_2[i];
        
            }
            

            return Arrays.stream(answer).collect(Collectors.joining());
        }
    }
}

// 접근 1. 

/*      
    다른 사람 풀이(1)
        
*/