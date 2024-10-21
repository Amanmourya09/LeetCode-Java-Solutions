class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> result = new ArrayList();
        int[] max_b_frequencies = new int[26];
        for(int i = 0; i<B.length; i++){
            String current_word = B[i];
            int[] char_frequencies = get_char_frequency(current_word);
            for(int j = 0; j<26; j++) {
                max_b_frequencies[j] = Math.max(max_b_frequencies[j], char_frequencies[j]);
            }
        }
        for(int i =0; i<A.length; i++) {
            String current_word = A[i];
            int[] char_counts = get_char_frequency(current_word);
                     
                     boolean valid = true;



                for(int j = 0; j<26; j++) {
                if(max_b_frequencies[j] > char_counts[j]) {
                    valid = false;
                    break;
                }
            }
            if(valid) result.add(current_word);
        }
        return result;
    
    }
    public int[] get_char_frequency(String S) {
        int[] result = new int[26];
        for(char c : S.toCharArray()) {
            result[c-'a']++;
        }
        return result;
    }
}