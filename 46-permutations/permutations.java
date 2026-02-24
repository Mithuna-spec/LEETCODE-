class Solution {
    // we can use inbuilt swap method:
    // Collections.swap(x[],y,z)
    // static void swap(int nums[], int i, int j){
    //         int temp = nums[i];
    //         nums[i] = nums[j];
    //         nums[j] = temp;
    //     }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }
        backtrack(result, list, 0);
        return result;
    }
    static void backtrack(List<List<Integer>> result, List<Integer> list , int index){
        if(index == list.size()){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=index; i<list.size(); i++){
            Collections.swap(list, index, i);
            backtrack(result, list, index+1);
            Collections.swap(list, index, i);
        }
    }
}