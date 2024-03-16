public class Main {
    public static void main(String[] args) {
        Solution so = new Solution();
        int [] gas = {3,3,4}, cost = {3,4,3} ;
        System.out.println(so.canCompleteCircuit(gas,cost));
    }
}

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int allGas = 0;
        int allCost = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            System.out.println(i);
            allGas += gas[i];
            allCost += cost[i];
            tank += gas[i] - cost[i];

            if(tank < 0){
                start = i + 1;
                tank = 0;
            }
        }

        if(allGas < allCost){
            return -1;
        }

        return start;
    }
}