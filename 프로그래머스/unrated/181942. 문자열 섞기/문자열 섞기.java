
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        
        
        
        for(int i=0; i<c1.length; i++)
        {
            sb.append(c1[i]).append(c2[i]);
        }
        
        String result = sb.toString();
        return result;
    }
}