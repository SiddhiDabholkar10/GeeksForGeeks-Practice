/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/search-in-rotated-array-2/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public boolean search(int[] arr, int key) {
        // code here
        int high = arr.length-1;
        int low = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == key) return true;
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                //left is sorted
                if(key>=arr[low] && key<=arr[mid]){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                //right is sorted
                if(key>=arr[mid] && key<=arr[high]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return false;
        
    }
}

