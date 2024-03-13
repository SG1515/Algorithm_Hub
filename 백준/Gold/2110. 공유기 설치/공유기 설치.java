import java.io.*;
import java.util.*;

public class Main{
	public static int[] house;
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken()); // 집의 개수
        int M = Integer.parseInt(st.nextToken()); // 공유기 개수
        
        house= new int[N]; // 집의 좌표 
        
        for(int i=0; i<N; i++) {
        	house[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(house); // 이분탐색은 반드시 정렬해야함
        
        int lo = 1; // 최소 거리가 가질 수 있는 최소값
        int hi = house[N-1] - house[0] + 1; //최소 거리가 가질 수 있는 최대 값
        
        // upper bound 형식 
        while(lo < hi) {
        	int mid = (hi+lo) / 2;
        	
        	
        	if(canInstall(mid) < M) { // M=3
        		//mid 거리에 대해 설치 가능한 공유기 개수가 M에 못미치면 거리를 좁히기 (hi) 줄이기        		
        		hi = mid;
        	} else if (canInstall(mid) >= M) {
        		
        		//설치 가능한 공유기 개수가 M보다 크거나 같으면 
        		//거기를 벌리면서 최소 거리가 가질 수 있는 최대거리를 찾기
        		lo = mid+1;
        	}
        }
    	/*
		 *  Upper Bound는 탐색 값을 초과하는 첫 번째 값을 가리키므로, 
		 *  1을 빼준 값이 조건식을 만족하는 최댓값이 된다.
		 */
        System.out.println(lo - 1);
        
    }
    
    public static int canInstall(int distance) {
    	int count = 1; // 첫 집 설치
    	int lastLocate = house[0]; //첫 집 주소 
    	
    	for(int i=1; i<house.length; i++) {
    		int locate = house[i];
    		
    		// 현재 탐색하는 집의 위치와 직전에 설치했던 집의 위치간 거리가 최소 거리(distance)보다 크거나 같을 때 공유기 설치 개수 늘리기
    		if(locate - lastLocate >= distance) {
    			count++; // 공유기 설치
    			lastLocate = locate; //마지막 설치 위치 갱신
    		}
    	}
    	
    	return count;
    }
}