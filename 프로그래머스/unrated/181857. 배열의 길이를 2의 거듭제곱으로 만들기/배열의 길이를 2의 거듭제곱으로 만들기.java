import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);
        }
        
        if (arr.length < 2){
            return list;
        }
        int tmp = 2;
        while (arr.length > tmp){
            tmp *= 2;
        }
        
        if(tmp - arr.length > tmp/2 - arr.length){
            for(int i=0; i<tmp - arr.length; i++){
                list.add(0);
            }
        } else if (tmp - arr.length < tmp/2 - arr.length){
                return list;
        }
        
        return list;
    }
}