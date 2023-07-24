import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder str = new StringBuilder();

        while(true){
            int N = Integer.parseInt(br.readLine());
            if(N == -1)
                break;

            ArrayList<Integer> list = new ArrayList<>();
            int sum = 0;

            for(int i = 1; i < N; i++){
                if(N % i == 0) {
                    list.add(i);
                    sum += i;
                }
            }
            str.append(N);
            if(N == sum) {
                str.append(" = ");
                for (int i = 0; i < list.size()-1; i++)
                    str.append(list.get(i) + " + ");
                str.append(list.get(list.size()-1));
            }
            else
                str.append(" is NOT perfect.");
            str.append("\n");
        }

        System.out.print(str);
        br.close();
    }
}