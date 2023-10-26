// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String[] strArray = {"dag", "dacecar", "dar"};
//        Solution so = new Solution();
//        so.longestCommonPrefix(strArray);
//        System.out.println(so.longestCommonPrefix(strArray));
        }
}

class Solution {
    public String longestCommonPrefix(String[] v) {
        StringBuilder ans = new StringBuilder();
//        Arrays.sort(v);
        String first = v[0];
        String last = v[v.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
}