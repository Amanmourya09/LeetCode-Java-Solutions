class Solution {
    #define l1 long long
public:
    long long pickGifts(vector<int>& gifts, int k) {
        priority_queue<int> maxheap(gifts.begin(), gifts.end());
        while(k--){
            int curr = maxheap.top();
            maxheap.pop();

            maxheap.push(sqrt(curr));
        }
        l1 sum = 0;
        while(!maxheap.empty()) {
            sum += maxheap.top();
            maxheap.pop();
        }
        return sum;
    }
};