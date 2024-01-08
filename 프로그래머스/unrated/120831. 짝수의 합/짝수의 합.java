class Solution {
    public int solution(int n) {
        int answer = 0;
        int even =0;
        for(int i =0; i<n+1; i++){
            if(i%2==0){
                even +=i;
            }
        }
        answer = even;
        return answer;
    }
}