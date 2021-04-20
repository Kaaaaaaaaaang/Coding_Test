/*
문제 설명
두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

제한 조건
a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
a와 b의 대소관계는 정해져있지 않습니다.
*/

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        if(a < b) {
            while(a <= b) {
                answer += a;
                a++;
            }
        }else {
            while(a >= b) {
                answer += b;
                b++;
            }
        }
        return answer;
    }
}

// a가 b보다 클 때, b가 a보다 클 때 두 가지 경우의 상황을 제시한다.
// a가 b보다 작을 때, a를 1씩 증가시키면서 answer에 a값을 더해준다.
