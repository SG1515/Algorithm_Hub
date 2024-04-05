import java.util.*;
import java.lang.*;
import java.io.*;
 
class Solution {
    static int change;
    static int[] list;
    static int result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int T = Integer.parseInt(br.readLine());
 
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
 
            String s = st.nextToken();
            change = Integer.parseInt(st.nextToken());
 
            list = new int[s.length()];
 
            // 교환수는 숫자판의 크기만큼이면 전부 옮길 수 있음
            if (s.length() < change)
                change = s.length();
            for(int j=0; j<s.length(); j++){
                list[j] = s.charAt(j) - '0';
            }
 
            DFS(0,0);
 
            System.out.print("#" + (i+1) + " " + result + "\n");
 
            //초기화
            init();
        }
 
    }//end of main
 
    public static void DFS(int s, int count){
        if(change == count) {
            StringBuilder sb = new StringBuilder();
            for(int x : list){
                sb.append(x);
            }
            // 매 c
            result = Math.max(result, Integer.parseInt(sb.toString()));
            return;
        }
 
        for(int i=s; i<list.length-1; i++){
            for(int j=i+1; j<list.length; j++){
                int tmp = list[i];
                list[i] = list[j];
                list[j] = tmp;
 
                DFS(s, count+1);
 
                // 되돌리기
                tmp = list[j];
                list[j] = list[i];
                list[i] = tmp;
            }
        }
 
    }
 
    public static void init(){
        list = null;
        result = 0;
    }
}