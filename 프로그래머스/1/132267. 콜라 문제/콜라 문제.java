class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int tmp =0;
        //a 나누는 수 b콜라 n빈병
        while (n >= a){            
            answer += (n/a) * b;
            n = (n/a) * b + (n%a); // 나머지 더해주기
        }
        
        
        return answer;
    }
}