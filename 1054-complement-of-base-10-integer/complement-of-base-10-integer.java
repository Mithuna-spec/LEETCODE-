class Solution {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
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
    }
}