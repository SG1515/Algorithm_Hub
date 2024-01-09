import java.util.ArrayList;
class Solution {
    public ArrayList<String> solution(String myStr) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<> ();
        
        String tmp = myStr.replaceAll("[abc]", " ");
        answer = tmp.split(" ");
        

        
        for(int i=0; i<answer.length; i++){
            if(!answer[i].equals(""))
                list.add(answer[i]);
        }
        
        if(list.size() == 0){
            list.add("EMPTY");
            return list;
        }
        
        return list;
    }
}