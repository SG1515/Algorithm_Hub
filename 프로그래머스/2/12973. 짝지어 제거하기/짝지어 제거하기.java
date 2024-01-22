import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        
        for(char ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else{
                stack.push(ch);
            }
            
        }
        return  stack.isEmpty() ? 1 : 0;
  
    }
}