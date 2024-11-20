class Solution {
public:
    void reverseString(vector<char>& A) {
        stack<char> st;
        for(int i = 0; i<A.size(); i++) {
            // pushing every char inside stack
            st.push(A[i]);
        }

        // pop every character
        for(int i = 0; i<A.size(); i++){
            A[i] = st.top();
            st.pop();
        }
    }
};