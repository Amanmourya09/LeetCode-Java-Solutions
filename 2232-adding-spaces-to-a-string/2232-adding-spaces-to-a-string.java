class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] cStr = new char[s.length() + spaces.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<spaces.length && j<s.length()) {
            int insertionIndex = spaces[i];
            while(j < insertionIndex && j<s.length()){
                cStr[k] = s.charAt(j);
                k++;
                j++;
            }
            cStr[k] = ' ';
            k++;
            i++;
        }
        while(j<s.length()){
            cStr[k] = s.charAt(j);
            k++;
            j++;
        }

        return new String(cStr);
    }
}