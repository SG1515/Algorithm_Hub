class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i*i<=n; i++){
            if(n % i == 0){
                answer += i; //약수 넣기
                
                if(i * i != n){ // 제곱수는 중복이여서 넣지 않기
                answer += n/i;  //약수 넣기
                }
            }
        }
        return answer;
    }
}