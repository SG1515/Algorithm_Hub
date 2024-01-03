import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        for(int i=0; i<query.length; i++){
            if(i % 2 == 0){ // 짝
                arr = Arrays.copyOfRange(arr, 0, query[i]+1);
            } else { //홀
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        return arr;
    }
}