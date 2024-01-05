class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result = 0;
        for(int i=0; i<num_list.length; i++) {
            int cnt =0;
            int n = num_list[i];
            while(n != 0){
                if(n == 1) break;
                n /= 2;
                cnt++;
            }
            result += cnt;
        }
        
        return answer = result;
    }
}