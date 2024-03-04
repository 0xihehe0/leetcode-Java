import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 3, 7};
        int target = 7;
        Solution so = new Solution();
        System.out.println(so.combinationSum(list, target));
    }
}

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List resList = new ArrayList<>();
        int start = 0;
        Arrays.sort(candidates);
        List checkList = new ArrayList<>();
        backtrack(checkList, target, start, candidates, resList);
        return resList;
    }

    void backtrack(List<Integer> state, int target, int start, int[] choices, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(state));
            return;
        }

        for (int i = start; i < choices.length; i++) {
            int value = choices[i];
            if (target - value < 0) {
                continue;
            }
            state.add(value);
            backtrack(state, target - value, i, choices, res);
            state.remove(state.size() - 1);
        }
    }
}