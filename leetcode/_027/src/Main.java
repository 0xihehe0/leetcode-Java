// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int [] nums = {1,2,2,5,65,7};
        int val = 2;
        Solution so = new Solution();

        System.out.println(so.removeElement(nums,val));
        }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;
        while(left < right){
            if(nums[left] == val){
                nums[left] = nums[right - 1];
                right --;
            }else{
                left ++;
            }
        }
        return left;
    }
}