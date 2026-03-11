class Solution {
    public int bitwiseComplement(int n) {
        // Below is my approach:
       /* String binary = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<binary.length(); i++){
            if(binary.charAt(i)=='1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        String str = sb.toString();
        return Integer.parseInt(str, 2);
        */
        

        // optimised approach is:
       
        if (n == 0) return 1;

        int mask = 0;
        int temp = n;

        while (temp > 0) {
            mask = (mask << 1) | 1;
            temp >>= 1;
        }

        return n ^ mask;
    }
}