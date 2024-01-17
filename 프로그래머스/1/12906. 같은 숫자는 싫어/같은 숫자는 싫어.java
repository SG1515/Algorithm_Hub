import java.util.*;

public class Solution {
    public ArrayList<Integer> solution(int []arr) {
        int[] answer = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<>();
        int tmp= -1;
        for(int i=0; i<arr.length; i++){
            if(tmp != arr[i]){
                list.add(arr[i]);
                tmp = arr[i];
            }
        }
        
        return list;
    }
}