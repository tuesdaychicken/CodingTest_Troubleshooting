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

public class Programmers_D3_ShufflingStrings {

    public static void main(String[] args) {
            solution("aaaaa", "bbbbb");
    }

        public static String solution(String str1, String str2) {
            String[] str_1 = str1.split("");
            String[] str_2 = str2.split("");

            String[] answer = new String[(str_1.length+str_2.length)/2];

            for(int i = 0; i< (str_1.length + str_2.length)/2; i++){
                answer[i] = str_1[i] + str_2[i];               
            }
            
            return Arrays.stream(answer).collect(Collectors.joining());
        }
    
}

// 접근 1. 

/*      
    다른 사람 풀이(1)
        String answer = "";

        for(int i = 0; i < str1.length(); i++){
            answer+= str1.charAt(i);
            answer+= str2.charAt(i);
        }

        return answer;

    다른 사람 풀이(2)
        String answer = "";

        for(int i=0; i<str1.length(); i++) {
            answer += "" + str1.charAt(i) + str2.charAt(i);
        }

        return answer;
    
    다른 사람 풀이(3)
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<chars1.length; i++) {
            sb.append(chars1[i]).append(chars2[i]);
        }

        return sb.toString();
*/

/*  나의 잘못된 접근
    실수 1. 배열의 접근 이해 미숙
        값을 집어 넣는 과정에서 문제발생     Index 5 out of bounds for length 5
        안에 넣는 것만 신경 쓰다 꺼내주는 배열 str_1 && str_2가 문제 였음
        문제는 안에 넣어주는 첫번째 값에는 ab가 동시에 들어가 2개의 값이 들어가고
        꺼내주는 값은 5번째까지인데 길이를 str_1+str_2로 지정 해서 길이가 10번째가 됨
        따라서 5번째 까지 값을 넣으면 str_1이나 str_2에서는 더이상 꺼낼 값이 없어짐
*/