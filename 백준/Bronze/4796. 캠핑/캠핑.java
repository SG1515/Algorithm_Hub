import java.util.*;
import java.io.*;
public class Main{
    
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int caseNum = 1;
        while(true) {
            st = new StringTokenizer(br.readLine());
            int canUseDate = Integer.parseInt(st.nextToken());
            int openDate = Integer.parseInt(st.nextToken());
            int vacation = Integer.parseInt(st.nextToken());
            
            if(canUseDate==0) {
                break;
            }
            
            int answer = 0;
            answer += ( (vacation/openDate) * canUseDate );
            if(vacation%openDate <= canUseDate) {
                answer += vacation%openDate;
            }else {
                answer += canUseDate;
            }
            
            sb.append("Case ");
            sb.append(caseNum++);
            sb.append(": ");
            sb.append(answer);
            sb.append("\n");

        } 
        
        bw.write(sb.toString());
        
        bw.flush();
        br.close();
        bw.close();
        
    }

    
}