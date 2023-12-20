class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int lastNum = num_list.length;
        
        int lastA = num_list[lastNum - 1];
        int lastB = num_list[lastNum - 2];
        
        for(int i=0; i<num_list.length; i++)
            answer[i] = num_list[i];
        
        if (lastA > lastB)
            answer[num_list.length] = lastA - lastB;
        else
            answer[num_list.length] = lastA *2;
        
        return answer;
    }
}