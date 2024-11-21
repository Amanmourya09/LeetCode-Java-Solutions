class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans = "";
        if(strs.size()==0) return "";
        string s = *min_element(strs.begin(), strs.end()); /// return min string

        for(int i =0; i<s.size(); i++) {
            for(int j = 0; j<strs.size(); j++) {
                if(s[i] != strs[j][i]){
                    return ans;
                }
            }
            ans.push_back(s[i]);
        }
        return ans;
    }
};