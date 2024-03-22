package CodingTest_Troubleshooting;

import java.util.Scanner;

/*
문제설명
    자연수 n이 입력으로 주어졌을 때 
    만약 n이 짝수이면 "n is even"을, 
    홀수이면 "n is odd"를 출력하는 코드를 작성해 보세요.
   
제한사항
    1 ≤ n ≤ 1,000
   
입출력 예
입력 #1
    100
   
출력 #1
    100 is even

입력 #2
    1
   
출력 #2
    1 is even
 */

public class Programmers_D2_OddEvenDistinction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println(n + " is even");
        }else{
            System.out.println(n + " is odd");
             }

        sc.close();
    }

    
}

// 접근 1. 

/*      
    다른 사람 풀이(1)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));
        
*/