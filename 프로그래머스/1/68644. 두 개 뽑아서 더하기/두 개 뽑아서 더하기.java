import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int idx = 0;
        for(int i=0;i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++){
                list.add(numbers[i] + numbers[j]);
            }
        }
        
        HashSet<Integer> set = new HashSet<>(list);
        ArrayList<Integer> resultList = new ArrayList<>(set);
        int[] tmp = new int[resultList.size()];
        
        for(int i=0; i<resultList.size(); i++){
            tmp[i] = resultList.get(i);
        }
        
        Arrays.sort(tmp);
        
        
        return tmp;
    }
}