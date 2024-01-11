import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            answer.add(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<delete_list.length; j++){
                if (arr[i] == delete_list[j]){
                    answer.remove(Integer.valueOf(arr[i])); //겹치는 숫자 
                } 
            }           
        }
        
        
        return answer;
    }
}