class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        int tmp = 0;
        for(int i=0; i<numbers.length; i++){
            tmp += numbers[i];
            
            if(tmp > n) {
                return tmp;
            }
        }
        
        return tmp;
    }
}