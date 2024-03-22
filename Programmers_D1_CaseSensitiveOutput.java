package CodingTest_Troubleshooting;

import java.util.Scanner;

/*
문제설명
    영어 알파벳으로 이루어진 문자열 str이 주어집니다. 
    각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 
    출력하는 코드를 작성해 보세요.
   
제한사항
    1 ≤ str의 길이 ≤ 20
        str은 알파벳으로 이루어진 문자열입니다.
   
입출력 예
입력 #1
    aBcDeFg
   
출력 #1
    AbCdEfG
 */

public class Programmers_D1_CaseSensitiveOutput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        char[] arr;
        arr = a.toCharArray();

        for (int i = 0; i < arr.length; ++i) {
            if (65 <= arr[i] && arr[i] <= 90) {
                arr[i] = (char) (arr[i] + 32);
                continue;
            }
            if (97 <= arr[i] && arr[i] <= 122) {
                arr[i] = (char) (arr[i] - 32);
                continue;
            }
        }

        System.out.print(arr);
        sc.close();
    }
}

// 접근 1. 문자열을 배열에 넣어 하나씩 대문자인지 소문자인지 체크한 후 변환 하여 다시 문자열에 넣고 반환

/*
 * 다른 사람 풀이(1)
 * Scanner sc = new Scanner(System.in);
 * String a = sc.next();
 * String answer = "";
 * 
 * //Stack <Character> stack = new Stack <> ();
 * 
 * for(Character c : a.toCharArray()){
 * if(Character.isUpperCase(c)){
 * //stack.push(Character.toLowerCase(c));
 * answer += Character.toLowerCase(c);
 * }
 * else if(Character.isLowerCase(c)){
 * //stack.push(Character.toUpperCase(c));
 * answer += Character.toUpperCase(c);
 * }
 * }
 * System.out.println(answer);
 * 
 * 다른 사람 풀이 (2)
 * Scanner sc = new Scanner(System.in);
 * String a = sc.next();
 * for(int i=0; i<a.length(); i++) {
 * char c = a.charAt(i);
 * if(Character.isUpperCase(c)) {
 * System.out.print((char)(c+32));
 * }
 * else {
 * System.out.print((char)(c-32));
 * }
 * }
 * 
 * 다른 사람 풀이 (3)
 * Scanner sc = new Scanner(System.in);
 * String a = sc.next();
 * 
 * String answer = "";
 * 
 * for(int x : a.toCharArray()){
 * if(x>=97 && x<=122)answer += (char)(x-32); else answer += (char)(x+32);
 * }
 * System.out.print(answer);
 */