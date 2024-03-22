package CodingTest_Troubleshooting;

import java.util.Scanner;

/*
문제설명
    두 정수 a, b가 주어질 때 
    다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
    a + b = c
   
제한사항
    1 ≤ a, b ≤ 100
   
입출력 예
입력 #1
    4 5
   
출력 #1
    4 + 5 = 9
 */

public class Programmers_D2_AdditiveExpressionOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+" + "+b+" = "+(a+b));

        sc.close();
    }
}

/*      
    다른 사람 풀이(1)
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d + %d = %d",a,b,a+b);

    다른 사람 풀이(2)
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;

        System.out.println(a + " + " + b + " = " + sum);
*/