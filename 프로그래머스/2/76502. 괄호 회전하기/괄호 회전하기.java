import java.util.Stack;
import java.util.ArrayList;
class Solution {
    public int solution(String s) {
        int answer = 0;
        // 문자열 회전하기
        for(int i=0; i<s.length(); i++){
            // substring(a, b-1);
            String str = s.substring(i, s.length()) + s.substring(0, s.length());
            Stack<Character> stack = new Stack<>();
            
            for(int j=0; j<s.length(); j++){
                char c = str.charAt(j);
                    
                if (stack.isEmpty()) stack.push(c);
                else if (c == ')' && stack.peek() == '('){
                    stack.pop();
                } else if(c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if(c == '}' && stack.peek() =='{' ){
                    stack.pop();
                } else {
                    stack.push(c);    
                }
            }
            if(stack.isEmpty()) // 비어있으면 다 처리됨
                answer++;
           
        }
        
        return answer;
    }
}