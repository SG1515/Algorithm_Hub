class Solution {
    public int solution(int[] num_list) {
        StringBuilder sbOdd = new StringBuilder();
        StringBuilder sbEven = new StringBuilder();
        
        for(int i : num_list){
            if (i % 2 == 0) //짝수
                sbEven.append(i);
            else 
                sbOdd.append(i);
        }
        int changeEven = Integer.parseInt(sbEven.toString());
        int changeOdd = Integer.parseInt(sbOdd.toString());
        
        int sum = changeEven + changeOdd;
        return sum;
    }
}