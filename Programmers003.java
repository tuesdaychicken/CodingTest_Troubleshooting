package CodingTest_Troubleshooting;

import java.util.Scanner;

public class Programmers003 {
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

//do while문을 통해 작성 하였으면 a로 증가값을 나타내 n횟수만큼 반복되게 함

//System.out.println(str.repeat(n));
//이건 다른 사람이 푼 방식으로 repeat()라는 메서드를 사용