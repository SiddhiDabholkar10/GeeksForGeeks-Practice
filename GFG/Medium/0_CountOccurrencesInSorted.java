/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/number-of-occurrence2259/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int firstOccurrence(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                ans = mid;
                high = mid-1;
            }
            else if(target>arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    int lastOccurrence(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                ans = mid;
                low=mid+1;
            }
            else if(target>arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    int countFreq(int[] arr, int target) {
        // code here
        int first = firstOccurrence(arr,target);
        if(first == -1) return 0;
        int last = lastOccurrence(arr,target);
        return last - first +1;
        
    }
}

