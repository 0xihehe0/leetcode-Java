public class Main {
    public static void main(String[] args) {
        int num = 320;
        Solution so = new Solution();
        System.out.println(so.reverse(num));
    }
}

class Solution {
    public int reverse(int x) {
        if(x == 0){
            return x;
        }
        boolean IsPosstive = false;
        if(x < 0){
            IsPosstive = true;
        }
        int value = Math.abs(x);
        int reversed = 0;
        while (value != 0) {
            // 检查溢出
            if (reversed > Integer.MAX_VALUE/10 || reversed < Integer.MIN_VALUE/10) {
                return 0;
            }
            int digit = value % 10; // 获取最后一位
            reversed = reversed * 10 + digit; // 将最后一位加到反转后的数字上
            value /= 10; // 去掉最后一位
        }
        System.out.println(reversed);
        return IsPosstive ? reversed * -1 : reversed;
    }
}

