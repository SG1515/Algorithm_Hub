class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long tmp =0;
        for(int i=1; i<count+1; i++){
            tmp += i*price;
        }
        
        if(money < tmp) {
            answer = tmp - money;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}