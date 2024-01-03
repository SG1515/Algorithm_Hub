import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        if(n == num_list.length){
            int p = num_list[n-1];
            return new int[] {p};
        } else{
            answer = Arrays.copyOfRange(num_list, n-1, num_list.length);
            
        }
        
        
        return answer;
    }
}