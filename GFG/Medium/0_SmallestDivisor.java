/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/smallest-divisor/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int smallestDivisor(int[] arr, int k) {
        // Code here
        int len = arr.length;
        int low = 1;
        int high =  Arrays.stream(arr).max().getAsInt();
        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            int sum = 0;
            for(int i=0;i<len;i++){
                sum += (arr[i] + mid - 1L) / mid;
            }
            if(sum<=k){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
            
        }
        return ans;
                                                            
    }
}
