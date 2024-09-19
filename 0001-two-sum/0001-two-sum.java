class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]  output = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int y = i + 1; y < nums.length; y++) {
                if(nums[i] + nums[y] == target) {
                    output[0] = i;
                    output[1] = y;
                    return output;
                }
            }
        }
        return output;
    }
}