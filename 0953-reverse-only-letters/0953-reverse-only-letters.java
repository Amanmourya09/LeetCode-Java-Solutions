class Solution {
    public String reverseOnlyLetters(String S) {
        int start = 0;
        int end = S.length() -1;

        char[] chars = S.toCharArray();
        while(start < end) {
            while(start < end && !Character.isLetter(chars[start])) start++;
            while(start < end && !Character.isLetter(chars[end])) end--;
            char tmp = chars[start];
            chars[start] = chars[end];
            chars[end] = tmp;
            start++;
            end--;
        }
        return new String(chars);
    }
}