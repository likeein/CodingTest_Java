class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        answer = num1/ (double)num2;
        return (int) (answer*1000);
    }
}