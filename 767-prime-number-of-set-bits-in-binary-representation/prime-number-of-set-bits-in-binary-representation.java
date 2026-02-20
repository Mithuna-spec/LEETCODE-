class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        int mask = 665772;
        for(int i=left; i<=right; i++){
            int bits = Integer.bitCount(i);
            if (((mask >> bits) & 1) == 1) {
                count++;
            }
        }
        return count;
    }
}