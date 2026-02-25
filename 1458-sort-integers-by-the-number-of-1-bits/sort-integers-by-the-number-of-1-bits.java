// import java.util.*;
// class Solution {
//     public int[] sortByBits(int[] arr) {
//         int arr2[] = new int[arr.length];
//         ArrayList<Integer> obj = new ArrayList<>();
//         ArrayList<Integer> obj2 = new ArrayList<>();
//         Arrays.sort(arr);
//         for(int ele: arr){
//             if((ele & (ele-1)) == 0 || ele==0){
//                 obj.add(ele);
//             }
//             else{
//                 obj2.add(ele);
//             }
//         }
//         for(int i=0; i<obj.size(); i++){
//             arr2[i] = obj.get(i);
//         }
//         for(int i=0; i<obj2.size(); i++){
//             arr2[obj.size()+i]= obj2.get(i);
//         }
//         return arr2;
//     }
// }

import java.util.*;

class Solution {
    public int[] sortByBits(int[] arr) {

        Integer[] temp = new Integer[arr.length];

        // Convert int[] to Integer[]
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        // Sort using custom comparator
        Arrays.sort(temp, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {

                int countA = Integer.bitCount(a);
                int countB = Integer.bitCount(b);

                if (countA == countB) {
                    return a - b;   // sort normally if bit count same
                }

                return countA - countB;  // sort by bit count
            }
        });

        // Convert back to int[]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}