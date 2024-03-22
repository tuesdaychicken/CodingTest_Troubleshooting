package CodingTest_Troubleshooting;
import java.util.Scanner;

/*
문제설명
    문자열 str이 주어질 때, str을 출력하는 코드를 작성해 보세요.
   
제한사항
    1 ≤ str의 길이 ≤ 1,000,000
    str에는 공백이 없으며, 첫째 줄에 한 줄로만 주어집니다.
   
입출력 예
입력 #1
    HelloWorld!
   
출력 #1
    HelloWorld!
 */

public class Programmers_D1_StringOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
       if(1 <= a.length() && a.length() <= 1000000){
             System.out.print(a.replaceAll("\\s+",""));
        }

        sc.close();
    }
}

// 접근 1. 공백을 제거하는걸로 해야하는데 공백이 생기면 뒤가 짤리는걸로 바뀜 문제를 잘 못 품

/*      
    다른 사람 풀이(1)
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int a = str.length();
        
        System.out.println(str);

    다른 사람 풀이(2)
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.length() > 1 && str.length() < 1000000 && !str.contains(" ")) {
            System.out.println(str);
*/
