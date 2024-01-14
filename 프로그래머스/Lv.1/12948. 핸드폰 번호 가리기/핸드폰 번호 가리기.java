class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        //뒷자리 4자리를 제외하고 전부 *로 대치하기
        char[] c = phone_number.toCharArray();
        for(int i=phone_number.length()-5; i>=0; i--){
            c[i] = '*';
        }
        
        answer = String.valueOf(c);
        
        return answer;
    }
}