class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        char prev = s.charAt(0);
        int freq = 1;
        for(int i = 1; i <s.length(); i++) {
            char c = s.charAt(i);
            if(c == prev) {
                freq++;
            } else {
                prev = c;
                freq = 1;
            }
            if(freq < 3) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}