class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int left = 0;
        int right = A.length-1;
        while(left <right) {
            int midpoint = left +(right-left) / 2;
            if(A[midpoint] < A[midpoint+1]) {
                left = midpoint +1;
            } else {
                right = midpoint;
            }
        }
        return left;
    }
}