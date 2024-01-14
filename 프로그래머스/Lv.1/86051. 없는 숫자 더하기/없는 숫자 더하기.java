import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(numbers);
        
        for(int i=0; i<=9; i++){
            list.add(i);
        }
        
        for(int i=0; i<numbers.length; i++){
            list.remove(Integer.valueOf(numbers[i]));
        }
        int tmp =0;
        for(int i=0; i<list.size(); i++){
            tmp += list.get(i);
        }
        answer =tmp;
        return answer;
    }
}