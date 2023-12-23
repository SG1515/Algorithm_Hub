import java.util.ArrayList;
class Solution {
    
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i=start_num; i<=end_num; i++){
            arrList.add(i);
            
        }
        
        int[] resultArray = new int[arrList.size()];
        for(int i=0; i<resultArray.length; i++){
            resultArray[i] = arrList.get(i);
        }
        
        
        return resultArray;
    }
}