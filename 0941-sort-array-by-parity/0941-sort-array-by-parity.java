class Solution {
    public int[] sortArrayByParity(int[] A) {
        int[] new_arr = new int[A.length];
        int counter = 0;

        for(int i = 0; i<A.length; i++){
            if(A[i] % 2 == 0) {
                new_arr[counter] = A[i];
                counter++;
            }
        }
        for(int i = 0; i<A.length; i++) {
            if(A[i] % 2 == 1) {
                new_arr[counter] = A[i];
                counter++;
            }
        }
        return new_arr;
    }
}