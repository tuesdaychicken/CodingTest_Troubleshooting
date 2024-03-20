package CodingTest_Troubleshooting;



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

        solution("He11oWor1d", "lloWorl", 2);
        
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        int num = 0;

        String [] answer1 = my_string.split("");
        String [] overwite1 = overwrite_string.split("");
        
        for(int i = 0; i < answer1.length; i++){
            if(i >= s-1 && i < s - 1 + overwrite_string.length()){
                answer1[i+1] = overwite1[num];
                num++;
            }
        }
        answer = String.join("", answer1);
        // 내가 입력한 값에 s번째니까 s가 2라면 i가 1일 때 해당 됨 
        //    그리고 들어오는 over의 길이만큼만 실행해야함
        // He11oWor1d lloWorl 2
        // 
        //  
        // 
        // HelloWorld
       
        System.out.println(answer);
        return answer;
    }
}
// answer = my_string.substring(0,s) + overwrite_string;
// 접근 1. 문자열을 입력하고 입력한 정수만큼의 뒷 부분을 날린 후 이어 붙인다
// 접근 2. 문자열을 배열에 넣고 해당 위치부터 새로운 문자를 넣고 출력

/*      
    다른 사람 풀이(1)
        

    다른 사람 풀이(2)
        
*/