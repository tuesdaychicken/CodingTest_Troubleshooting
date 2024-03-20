package CodingTest_Troubleshooting;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
문제설명
    문자열 my_string, overwrite_string과 정수 s가 주어집니다. 
    문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을 
    문자열 overwrite_string으로 바꾼 문자열을 return 하는 
    solution 함수를 작성해 주세요.
   
제한사항
    my_string와 overwrite_string은 숫자와 알파벳으로 이루어져 있습니다.
    1 ≤ overwrite_string의 길이 ≤ my_string의 길이 ≤ 1,000
    0 ≤ s ≤ my_string의 길이 - overwrite_string의 길이
   
입출력 예
    my_string           overwrite_string    s   result
    "He11oWor1d"        "lloWorl"           2   "HelloWorld"
    "Program29b8UYP"    "merS123"           7   "ProgrammerS123"

입출력 예 #1
    예제 1번의 my_string에서 인덱스 2부터 overwrite_string의 길이만큼에 
    해당하는 부분은 "11oWor1"이고 이를 "lloWorl"로 
    바꾼 "HelloWorld"를 return 합니다.

입출력 예 #2
    예제 2번의 my_string에서 인덱스 7부터 overwrite_string의 길이만큼에 
    해당하는 부분은 "29b8UYP"이고 이를 "merS123"로 
    바꾼 "ProgrammerS123"를 return 합니다.
 */

public class Programmers_DAY2_010 {

    public static void main(String[] args) {
        //TEST를 위해 추가한 main
        //solution("asdfqszcxqaw", "QQQQ",11); 조건을 잘 보자 규성아 이 개
        
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String[] a = my_string.split("");
        String[] b = overwrite_string.split("");
        
        for (int i = s; i < b.length + s; i++) {
            a[i] = b[i - s];
        }
        
        return Arrays.stream(a).collect(Collectors.joining());
    }
}

// 접근 1. 문자열을 입력하고 입력한 정수만큼의 뒷 부분을 날린 후 이어 붙인다
// 접근 2. 문자열을 배열에 넣고 해당 위치부터 새로운 문자를 넣고 출력

/*      
    다른 사람 풀이(1)
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;

    다른 사람 풀이(2)
        String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        return answer;
    
    다른 사람 풀이(3)
        char[] my_chars = my_string.toCharArray();
        char[] overwrite_chars = overwrite_string.toCharArray();
        for (int i=0; i<overwrite_chars.length; i++) {
            my_chars[s + i] = overwrite_chars[i];
        }
        return String.valueOf(my_chars);
*/

/*  나의 잘못된 접근
    실수 1.
그 다음을 어떻게 접근해야하는지 생각을 못했다
        answer = my_string.substring(0,s) + overwrite_string;

    실수 2.
코드를 짜다보니 스파게티 코드 및 에일리언 코드가 되어버렸다
이것은 엄청난 거다 에일리언 스파게티... 변수명을 잘 짓자
        String answer = "";
        int num = 0;

        String [] answer1 = my_string.split("");
        String [] overwite1 = overwrite_string.split("");

        if(my_string.length() < s + overwrite_string.length()){
            
            List<String> list = new ArrayList<>(Arrays.asList(answer1));
            for(int i=0; i<s+overwrite_string.length()-my_string.length(); i++){
                list.add(" ");
            }
            answer1 = list.toArray(new String[0]);

        }
        
        for(int i = 0; i < s + overwrite_string.length(); i++){
            if(i >= s-1 && i < s - 1 + overwrite_string.length()){
                answer1[i+1] = overwite1[num];
                num++;
                System.out.println(Arrays.toString(answer1));
            }
        }
        answer = String.join("", answer1);
       
        System.out.println(answer);
        return answer;
        
*/