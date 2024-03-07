public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 3;
        solution.arrangeCoins(n);
    }
}

class Solution {
    public int arrangeCoins(int n) {
        if(n <= 1){
            return n;
        }
        int x = 0;
        int all = 0;
        while(all <= n){
            x ++;
            all = all + x;
            System.out.println(all+","+x);
        }
        System.out.println(x);
        return x - 1;
    }
}