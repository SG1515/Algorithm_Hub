import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    static int N; // 1~N까지의 수
    static ArrayList<String> answer;
    static String op[] = {"+", "-", " "};
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i=0; i<T; i++) {
            N = Integer.parseInt(br.readLine());
            answer = new ArrayList<>();
            DFS(1, "1");

            Collections.sort(answer);
            for(String s : answer ){
                System.out.println(s);
            }
            System.out.println();
        }

    }

    public static void DFS(int num, String s) {
        if(num == N) {
            String str = s.replaceAll(" ", ""); // 공백제거
            if(cal(str)) {
                answer.add(s);
            }
            return;
        }
        for(int i=0; i<3; i++) { // + - 공백을 추가하면서 N까지 String 만들기
            DFS(num+1, s+op[i]+Integer.toString(num+1));
        }

    }


    public static boolean cal(String str) {
        // split을 사용하면 split("[\\+|-]")이다.
        // 파라미터true로 줘서 구분자 포함하여서 token에 담기
        StringTokenizer st = new StringTokenizer(str, "-|+", true);
        //첫번째 문자가 숫자니까 바로 sum에 담아주자
        int sum = Integer.parseInt(st.nextToken());
        while(st.hasMoreElements()) {// 토큰이 남아있으면 실행
             String s = st.nextToken();
             if(s.equals("+")) {
                 sum += Integer.parseInt(st.nextToken());
             }else {
                 sum -= Integer.parseInt(st.nextToken());
             }
        }

        if (sum == 0)
            return true;

        return false;
    }
}



/*
https://ilmiodiario.tistory.com/166*/
