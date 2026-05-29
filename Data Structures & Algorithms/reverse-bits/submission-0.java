class Solution {
    public int reverseBits(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int currBit = n >> i;
            int reverseBit = 1 << (31 - i);
            if ((currBit & 1) != 0) {
                ans |= (reverseBit);
            }
        }
        return ans;
    }
}
