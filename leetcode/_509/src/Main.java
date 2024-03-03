public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 6;
        solution.fib(n);
    }
}

class Solution {
    public int fib(int n) {
        int a = 0, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return a;
    }
}