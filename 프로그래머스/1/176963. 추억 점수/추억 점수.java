import java.util.HashMap;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for(int i=0; i<photo.length; i++){ // 한 행씩 검사
            String[] persons = photo[i]; // 행의 길이만큼 배열생성
            int score = 0;
            
            for(int j=0; j<persons.length; j++){
                String person = persons[j];
                if(map.containsKey(person)){ // key에 현재 배열의 photo 사람이 존재하면
                    score += map.get(person); 
                }
            }
            answer[i] = score;
        }
        
        return answer;
    }
}