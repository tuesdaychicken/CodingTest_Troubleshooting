package CodingTest_Troubleshooting;

/*
문제설명
    연산 ⊕는 두 정수에 대한 연산으로 두 정수를 붙여서 쓴 값을 반환합니다. 예를 들면 다음과 같습니다.

    12 ⊕ 3 = 123
    3 ⊕ 12 = 312
    양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return하는 solution 함수를 완성해 주세요.

    단, a ⊕ b와 2 * a * b가 같으면 a ⊕ b를 return 합니다.
   
제한사항
    1 ≤ a, b < 10,000
   
입출력 예
    a	b	result
    2	91	364
    91	2	912

입출력 예 설명
    입출력 예 #1
    a ⊕ b = 291 이고, 2 * a * b = 364 입니다. 
    둘 중 더 큰 값은 364 이므로 364를 return 합니다.

    입출력 예 #2
    a ⊕ b = 912 이고, 2 * a * b = 364 입니다. 
    둘 중 더 큰 값은 912 이므로 912를 return 합니다.
 */

public class Programmers_D3_CompareTwoNumericOperations {
    public int solution(int a, int b) {
        return Math.max(Integer.parseInt(a + "" + b), 2*a*b);
    }
}

// 접근 1. 지난 문제에서 다른 사람이 푼 방식에서 바로 응용하여 적용했다 사실은 응용이랄게 없다 나도 멋이란걸 부리고 싶었다