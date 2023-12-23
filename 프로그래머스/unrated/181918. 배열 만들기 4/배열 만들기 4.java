import java.util.ArrayList;

class Solution {
    
    public int[] solution(int[] arr) {
        
        
        ArrayList<Integer> aList = new ArrayList<>();
        int i =0;
        while(i < arr.length){
            
    
            if(aList.isEmpty()){
                aList.add(arr[i]);
                i++;
            } else {
                int lastNum = aList.get(aList.size()-1); // 마지막원소
                if(lastNum < arr[i]){    
                aList.add(arr[i]);
                i++;
                } 
                else if( lastNum >= arr[i]){
                aList.remove(aList.size()-1);
                }
            }
    
        }


        int[] answer = new int[aList.size()];
        for(int j=0; j< answer.length; j++){
            answer[j] = aList.get(j);
        } 
        return answer;
    }
}