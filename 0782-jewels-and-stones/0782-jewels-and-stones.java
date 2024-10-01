class Solution {
    public int numJewelsInStones(String J, String S) {
        int num_jewels = 0;

        for(int i=0; i<S.length(); i++) {
            if(J.indexOf(S.charAt(i)) > -1) {
                num_jewels += 1;
            }
        }
        return num_jewels;
    }
}