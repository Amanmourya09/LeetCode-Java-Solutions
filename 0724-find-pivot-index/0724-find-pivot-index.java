class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int i : nums ) totalSum += i;

        int accSum = 0;
        for(int i = 0; i<nums.length; i++) {
            if((totalSum - nums[i] - accSum) == accSum) return i;
            accSum += nums[i];


        }
        return -1;
    }
}