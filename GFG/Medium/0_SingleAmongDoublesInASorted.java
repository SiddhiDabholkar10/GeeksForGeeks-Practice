/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int single(int[] arr) {
        // code here
        int n = arr.length;
        if(n==1 || arr[0] != arr[1]) return arr[0];
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        int low = 1;
        int high = n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]!=arr[mid-1] && arr[mid]!=arr[mid+1]) return arr[mid];
            if((mid%2 == 1 && arr[mid]!=arr[mid-1]) || (mid%2==0 && arr[mid]!=arr[mid+1])){
                //either (mid is odd && it's previous is not same )
                //OR either is even && it's next is not same
                //which means the single element broke the pattern
                
                //the left side has the single element
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
