class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
     
        int num = numbers.length;
        int sum = 0;
        
        for(int i =0; i<num; i++){
            sum +=numbers[i];
        }
        answer = (double) sum/num;
        return answer;
    }
}