class Solution {
    public int fib(int n) {
        if(n == 0) return 0;

        int first = 0;
        int second = 1;
        while(n > 1) {
            int tmp = second;
            second = second + first;
            first = tmp;
            n--;
        }
        return second;
    }
}