import java.util.ArrayList;

class Solution {
    


    public int[] solution(int l, int r) {
        int[] answer;
        
        ArrayList<Integer> List = new ArrayList<>();

        for(int i=l; i<=r; i++){
            if(String.valueOf(i).matches("[05]+")){
                List.add(i);
            }
        }
 
        int[] numEmpty = new int[]{-1}; 
        if(List.isEmpty()) {
            return numEmpty;
        }
        
        int[] resultArray = new int[List.size()];
        for(int i=0; i< resultArray.length; i++){
            resultArray[i] = List.get(i);
        }   



        return resultArray;
    }
}