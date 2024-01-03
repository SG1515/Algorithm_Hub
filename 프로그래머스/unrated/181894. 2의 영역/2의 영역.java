import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};        
        
        for(int i=0; i<arr.length; i++){
            if (arr[i] == 2){
                list.add(i);
            }
        }
        
        if(list.size() ==0){
            return new int[] {-1};
        }
        
        int fir = list.get(0);
        int last = list.get(list.size()-1);
        answer = Arrays.copyOfRange(arr, fir, last+1);
        return answer;
    }
}

/*
last에서 list.size()-1 해준 것은 인덱스는 0번부터
Array.copyOfRange에서 last+1해준 것은 끝값은 포함되지 않기 때문에 +1
*/