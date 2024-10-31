class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1) return;

        int start = 0;
        int end = nums.length -1;
       int index = 0;
        while(start < end && index <= end ) {
            if(nums[index] == 2) {
                int tmp = nums[index];
                nums[index] = nums[end];
                nums[end] = tmp;
                end--;
            } else if(nums[index] == 0) {
                int tmp = nums[index];
                nums[index] = nums[start];
                nums[start] = tmp;
                start++;
                index++;

            } else {
                index++;
            }
        }
    }
}