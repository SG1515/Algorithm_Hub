import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String my_string) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        answer = my_string.split(" ");
        
        for(int i=0; i<answer.length; i++){
            if(!answer[i].equals("")){
                list.add(answer[i]);
            }
        }
        
        return list;
    }
}