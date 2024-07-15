import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
    
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for(int i=0; i<arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());//시작시간
            arr[i][1] = Integer.parseInt(st.nextToken());//끝난시간
        }

        Arrays.sort(arr, new Comparator<int[]>(){

            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[1] == o2[1]) { //종료시간이 같으면 
                    return o1[0] - o2[0];
                }

                return o1[1] - o2[1]; //종료시간 정렬
            }
            
        });

        int prev = 0;
        int count = 0;

        for(int i=0; i<arr.length; i++ ){
            if(prev <= arr[i][0]){
                prev = arr[i][1];
                count++;
            }
        }

        System.out.println(count);
    }
}