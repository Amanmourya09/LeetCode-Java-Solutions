class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        helper(nums, 0, nums.length -1);
        helper(nums, 0, k -1);
        helper(nums, k, nums.length -1);
    }
    public void helper(int[] nums, int start, int end ) {
        while(start < end){
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}