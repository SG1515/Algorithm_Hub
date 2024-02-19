import java.io.*;
import java.util.*;

class Point implements Comparable<Point>{ //정렬 2개해야하니까.
        int num;
        int idx;

        public Point(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }

        @Override
        public int compareTo(Point o){
            return this.num - o.num;
        }
}

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        Point[] A = new Point[n];
        
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            A[i] = new Point(Integer.parseInt(st.nextToken()), i);
        }
        
        Arrays.sort(A);
        int max =0;
        for(int i=0; i<n; i++) {
            if(A[i].idx - i > max ){
                max = A[i].idx - i;
            }
        }
        System.out.println(max+1);
        

        
    }//end of main
}


/*https://steady-coding.tistory.com/41 */