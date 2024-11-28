class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length - 1] < target) return nums.length;
        int i = 0;
        int j = nums.length - 1;
        while( i < j) {
            int mid = i+(j-i)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) j = mid;
            else i = mid + 1;
        }
        return i;
    }
}