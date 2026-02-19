class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        int arr[] = new int[s.length()];
        arr[0] = 1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i-1) != s.charAt(i)){
                arr[++count] = 1;
                /* count += 1;
                    arr[count] =1;
                */
            }
            else{
                arr[count]++;
            }
        }
        int ans =0;
        for(int i=1; i<=count; i++){
            ans += Math.min(arr[i-1], arr[i]);
        }
        return ans;
    }
}