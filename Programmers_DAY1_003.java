package CodingTest_Troubleshooting;

import java.util.Scanner;

/*
문제설명
    문자열 str과 정수 n이 주어집니다.
    str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
   
제한사항
    1 ≤ str의 길이 ≤ 10
    1 ≤ n ≤ 5
   
입출력 예
입력 #1
    string 5
   
출력 #1
    stringstringstringstringstring
 */

public class Programmers_DAY1_003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        int a = 0;

        do{
            System.out.print(str);
            a++;
        } while(a < n);

        sc.close();
    }
}

// 접근 1. do while문을 통해 작성 하였으면 a로 증가값을 나타내 n횟수만큼 반복되게 함

/*      
    다른 사람 풀이(1)
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        System.out.println(str.repeat(n));

    다른 사람 풀이(2)
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(str);
        }
        String s = sb.toString();
        System.out.println(s);
*/