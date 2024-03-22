package CodingTest_Troubleshooting;

/*
문제설명
    연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 
    예를 들면 다음과 같습니다.

    12 ⊕ 3 = 123
    3 ⊕ 12 = 312
    양의 정수 a와 b가 주어졌을 때, a ⊕ b와 b ⊕ a 중 더 큰 값을 return 하는 
    solution 함수를 완성해 주세요.

    단, a ⊕ b와 b ⊕ a가 같다면 a ⊕ b를 return 합니다.
   
제한사항
    1 ≤ a, b < 10,000
   
입출력 예
    a	b	result
    9	91	991
    89	8	898

입출력 예 설명
    입출력 예 #1
    a ⊕ b = 991 이고, b ⊕ a = 919 입니다. 
    둘 중 더 큰 값은 991 이므로 991을 return 합니다.
    
    입출력 예 #2
    a ⊕ b = 898 이고, b ⊕ a = 889 입니다. 
    둘 중 더 큰 값은 898 이므로 898을 return 합니다.
 */

public class Programmers_D3_MergeLarger {
    public int solution(int a, int b) {

        int answer1 = Integer.valueOf(""+a+b);
        int answer2 = Integer.valueOf(""+b+a);

        int answer = (answer1 > answer2) ? answer1 : (answer1 < answer2) ? answer2 : answer1 ;

        return answer;
    }
}

// 접근 1. 

/*      
    다른 사람 풀이(1)
        int answer = 0;
        int aLong = Integer.parseInt(""+a+b);
        int bLong = Integer.parseInt(""+b+a);
        answer = aLong > bLong ? aLong : bLong;

        return answer;

    다른 사람 풀이(2)
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        String strSum1 = strA + strB;
        String strSum2 = strB + strA;

        return Math.max(Integer.valueOf(strSum1), Integer.valueOf(strSum2));

    다른 사람 풀이(3)
        return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a));
*/

/*  나의 잘못된 접근
    실수 1.
        int answer1 = Integer.valueOf(String.valueOf(a)+String.valueOf(b));
        int answer2 = Integer.valueOf(String.valueOf(b)+String.valueOf(a));
        ""+숫자는 문자열이란걸 아는데 하나하나 해주고 앉아있네 중대장은 실망이 크다
        
*/