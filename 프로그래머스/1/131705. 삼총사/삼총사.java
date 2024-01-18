class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i=0; i< number.length; i++){
            for(int j= i+1; j<number.length; j++){
                for(int k= j+1; k<number.length; k++){
                    if(number[i] + number[j] + number[k] == 0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}

/*i는 number의 첫번째 수 부터, j는 i의 다음 수 부터, k는 j의 다음 수 부터 비교해주었다.*/