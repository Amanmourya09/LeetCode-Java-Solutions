class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] output = new int[nums.length];
        Arrays.fill(output, -1);
        Stack<Integer> stack = new Stack();

        for(int i = 0; i < nums.length * 2; i++) {
            while(!stack.isEmpty() && nums[stack.peek()] <nums[i % nums.length]) {
                output[stack.pop()] = nums[i % nums.length];
            }
            if(i < nums.length) stack.add(i);
        }
        return output;
    }
}