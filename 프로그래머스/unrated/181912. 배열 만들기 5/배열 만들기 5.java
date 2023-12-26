import java.util.ArrayList;
class Solution {
    
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        // s는 시작인덱스
        // l은 자를 문자열 길이
        // k보다 큰 값을 담아야함 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++){
            StringBuilder sb = new StringBuilder();

            String nArr = intStrs[i];
            char[] cArr = nArr.toCharArray();

            for(int j=s; j<s+l; j++){
                sb.append(cArr[j]);
            }
            String result = sb.toString();
            int changeNum = Integer.parseInt(result);
            
            if (k < changeNum)
                list.add(changeNum);
            
        }
        
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}