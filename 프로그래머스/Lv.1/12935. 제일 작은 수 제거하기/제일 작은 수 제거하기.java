import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int[] tmp = arr.clone();
        if(arr.length == 0 || arr[0] == 10) {
            answer = new int[]{-1};
        }
        
        Arrays.sort(arr);
        int minNum = arr[0];
        ArrayList<Integer> list = new ArrayList<>();        
        for(int i=0; i< arr.length; i++){
            if(minNum != tmp[i]){
                list.add(tmp[i]);
            }
        }
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}