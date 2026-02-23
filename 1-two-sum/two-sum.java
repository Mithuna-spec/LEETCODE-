class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
        int low=0;
        int arr[] = new int[2];
        for(int i=0; i<nums.length; i++){
            int high=i+1;
            while(high<nums.length){
                int sum=nums[i]+nums[high];
                if(sum==target){
                    arr[0]=i;
                    arr[1]=high;
                    break;
                }
                high++;
            }
        }
        return arr;
        */
        
        // int n= nums.length;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int[] {i,j};
        //         }
        //     }
        // }
        // return new int[] {};





        int arr[] = new int[2];
        // int i = 0;
        // int j = 0;
        int len = nums.length;
        for(int i=0; i<len-1; i++){
            for(int j=1; j<len; j++){
                if(nums[i]+nums[j]==target && i!=j){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}