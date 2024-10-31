class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for(int i  = 0; i<cost.length; i++) {
            if(i ==0 || i ==1) continue;
            cost[i] = cost[i] + Math.min(cost[i-1], cost[i-2]);

        }
        return Math.min(cost[cost.length -1], cost[cost.length - 2]);
        
    }
}