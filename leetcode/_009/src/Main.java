// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();
        System.out.println(so.isPalindrome(-5115));
    }
}

class Solution {
    public boolean isPalindrome(int x) {
        boolean Type = true;
        if(x < 0 ){
            Type = false;
            return Type;
        }
        String checkString = Integer.toString(x);
        int first = 0;
        int last = checkString.length() - 1;
        char firstChar = checkString.charAt(first);
        char lastChar = checkString.charAt(last);
        for (int i = 0; i < checkString.length(); i++) {
            if(checkString.charAt(first) != checkString.charAt(last)){
                Type = false;
                break;
            }
            if(first >= last){
                break;
            }
            first ++ ;
            last --;
        }
        return Type;
    }
}