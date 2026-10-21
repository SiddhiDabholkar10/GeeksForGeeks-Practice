/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/find-nth-root-of-m5843/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int pow(int base, int expo, int limit){
        int result = 1;
        for(int i=0; i<expo; i++){
            result = result * base;
            if(result>limit) return result;
        }
        return result;
    }
    public int nthRoot(int n, int m) {
        // code here
        if(m==0) return 0;
        if(n==1) return m;
        int low = 1;
        int high = m;
        while(low<=high){
            int mid = (low+high)/2;
            int val = pow(mid,n,m);
            if(val==m) return mid;
            else if(val<m) low = mid+1;
            else high = mid-1;
            
            
        }
        return -1;
    }
}
