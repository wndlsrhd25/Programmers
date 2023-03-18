class Solution {
    public int solution(int num1, int num2) {
        int num3 = num1 * num2;
        int answer = 0;
        
        if(num3>=0 && num3<=100000) {
            answer = num3;
        }
        
        return answer;
    }
}