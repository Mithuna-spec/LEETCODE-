// class Solution {
//     public String getPermutation(int n, int k) {
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i]= i+1;
//         }
//         backtrack(arr_2d, arr, 0);

//     }
//     public static void backtrack(int arr_2d[][] int arr[], int index){
//         if(index== arr.length){
//             result.add(new arr);
//             return;
//         }
//         for(int i=index; i<arr.length; i++){
//             swap(arr, index, i);
//             backtrack(arr_2d, arr, index+1);
//             swap(arr, index, i);
//         }
//     }
//     public static void swap(int arr[],int index, int i){
//         int temp = arr[index];
//         arr[index] = arr[i];
//         arr[i] = temp;
//     }
// }

// class Solution {
//     public static int factorial(int k){
//         if(k==0 || k==1){
//             return 1;
//         }
//         return factorial(k-1)*k;
//     }
//     public String getPermutation(int n, int k) {
//         StringBuilder sb = new StringBuilder();
//         for(int i=1; i<=n; i++){
//             sb.append(i);
//         }
//         StringBuilder ans = new StringBuilder();
//         while(k > 0){
//             int blocksize = factorial(n);
//             int index = (k)/blocksize; 
//             k = k - (index * blocksize);
//             ans.append(sb.charAt(index));
//         }
//         return ans.toString();
//     }
// }

class Solution {
     public String getPermutation(int n, int k){
        List<Integer> numbers = new ArrayList<>();
        int fact = 1;
        for(int i=1; i<n; i++){
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);

        k = k-1;
        StringBuilder ans = new StringBuilder();
        while(n > 0){
            int index = k/fact;
            ans.append(numbers.get(index));
            numbers.remove(index);
            k=k%fact;
            n--;
            if(n>0){
                fact = fact/n;
            }
        }
        return ans.toString();
     }
}