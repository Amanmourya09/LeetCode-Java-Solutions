class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int pairs = 0;
        for(char c: s.toCharArray()) {
            if(set.contains(c)) {
                pairs++;
                set.remove(c);
            } else {
                set.add(c);
            }

        }
        pairs = pairs *2;
        if(!set.isEmpty()) pairs ++;
        return pairs;
    }
}