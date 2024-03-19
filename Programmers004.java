package CodingTest_Troubleshooting;

import java.util.Scanner;

public class Programmers004 {
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
 * 다른 풀이
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
 */