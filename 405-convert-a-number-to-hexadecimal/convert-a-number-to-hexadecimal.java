class Solution {
    public String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        if(num==0){
            return "0";
        }
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        int mask = 0xf;
        while(num != 0){
            char ans = hex[num & mask];
            sb.append(ans);
            num = num >>> 4;
        }
        sb.reverse();
        return sb.toString();
    }
}