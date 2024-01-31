import java.util.ArrayList;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i<words.length; i++){
            if(list.contains(words[i])) { // 단어가 이전에 있으면
                answer[0] = i%n+1; //몇 번째 사람인지
                answer[1] = i/n+1; //몇 번째 순서였는지
                break;
            }
            list.add(words[i]);
            //이전 word의 마지막글자와 현재 word의 첫번째 글자 비교
            if(i>0 && words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0)) {
                answer[0] = i%n+1; //몇 번째 사람인지
                answer[1] = i/n+1; //몇 번째 순서였는지
                break;
            }
            
        }
        
        
        return answer;
    }
}