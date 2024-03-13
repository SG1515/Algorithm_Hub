import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int num = Integer.parseInt(st.nextToken());
        int count = 0;
        int sum = 1;
        int lt = 1;
        int rt = 1;
        while (rt <= num) { 

            if (sum == num) { // 같으면 count++, rt 시작값으로 변경, sum 초기화
                count++;
                rt++;
                sum += rt;
                
            } else if (sum > num) { 
                sum -= lt; // 왼쪽값 빼주고 
                lt++;  // 왼쪽값++
                
            } else if (sum < num) { 
                rt++; // 오른쪽값 한칸 옮기고
                sum += rt; // 오른쪽값 더해줌 
            }
             
        }
        
        System.out.println(count);
    }
}