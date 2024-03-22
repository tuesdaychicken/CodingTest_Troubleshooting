package CodingTest_Troubleshooting;

import java.util.Scanner;

/*
문제설명
    문자열 str이 주어집니다.
    문자열을 시계방향으로 90도 돌려서 
    아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
   
제한사항
    1 ≤ str의 길이 ≤ 10
   
입출력 예
입력 #1
    abcde
   
출력 #1
    a
    b
    c
    d
    e
 */

public class Programmers_D2_VerticalStringOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String[] result = a.split("");

        for(String out : result){
            System.out.println(out);
        }

        sc.close();
    }
}

// 접근 1. 

/*      
    다른 사람 풀이(1)
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char ch : a.toCharArray())
            System.out.println(ch);

    다른 사람 풀이(2)
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }
*/