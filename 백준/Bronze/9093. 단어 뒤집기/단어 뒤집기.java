import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<T; i++){
            st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()){
                char[] chArr = st.nextToken().toCharArray();

                for(int j=0; j<chArr.length; j++){
                    stack.push(chArr[j]);
                }
                for(int j=0; j<chArr.length; j++) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}