import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int n) {
        
        //초기화
        int[] answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        
        if (arr.length % 2 == 1) { //짝수 인덱스 배열
            for(int i=0; i<arr.length; i+=2) {
                answer[i] = arr[i] + n; 
            }
        } else {
            for(int i=1; i<arr.length; i+=2) {
                answer[i] = arr[i] + n;
            }
        }
        
        return answer;
    }
}