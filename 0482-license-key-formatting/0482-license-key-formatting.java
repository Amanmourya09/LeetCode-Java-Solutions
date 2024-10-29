class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder output = new StringBuilder();

        int count = 0;
        for(int i = S.length() -1; i>=0; i--) {
            if(S.charAt(i) == '-') continue;

            if(count == K) {
                output.append('-');
                count = 0;
            }
            output.append(S.charAt(i));
            count++;
        }
        return output.reverse().toString().toUpperCase();
    }
}