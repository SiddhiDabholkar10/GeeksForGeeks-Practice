/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int search(int[] arr, int key) {
        // code here
        int low = 0;
        int high = arr.length-1;
        
        while(low<=high){
            int mid = (low+high)/2;
            //if mid has key
            if(arr[mid] == key) return mid;
            if(arr[low]<=arr[mid])  //left side is sorted check if key is in that
            {
                if(key>=arr[low] && key<=arr[mid]) // our key is definitely on left
                {
                    high = mid-1;
                }
                else{
                    //our key is definitely not on the left
                    low = mid+1;
                }
            }
            else{
                //right side is sorted check if key is in that
                if(key>=arr[mid] && key<=arr[high]){
                    // our key is definitely on right
                    low = mid+1;
                }
                else{
                    //our key is definitely not on the right
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}
