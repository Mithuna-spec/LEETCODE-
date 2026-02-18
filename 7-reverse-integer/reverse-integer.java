class Solution {
    public int reverse(int x) {
        //x = (long) x;
        int y = x;
        // if(x<0){
        //     x = x*-1;
        // }
        int sum =0;
        while(x != 0){
            int rem = (x%10);
            if (sum > 214748364 || (sum == 214748364 && rem > 7))
                return 0;

            if (sum < -214748364 || (sum == -214748364 && rem < -8))
                return 0;
            sum = (sum*10)+rem;
            x=x/10;
        }
        // if(y < 0){
        //     return  sum*-1;
        // }
        return  sum;
    }
}