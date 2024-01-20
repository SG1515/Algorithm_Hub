class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n == 1 || n == 0) return 1;
        int a = 0;
        int b = 1;

        for(int i = 2; i <= n; i++){
            answer = (a+b) % 1234567;
            a = b;
            b = answer;
        }
        return   answer;
    }
}