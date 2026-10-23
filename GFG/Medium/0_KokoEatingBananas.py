"""
Problem Link : https://practice.geeksforgeeks.org/problems/koko-eating-bananas/1
Platform     : GFG
Difficulty   : Medium
"""

class Solution:
    def kokoEat(self, arr, k):
        # Code here
        low = 1;
        high = max(arr)
        ans = -1
        while(low<=high):
            mid = (low+high)//2
            hoursTaken = 0
            for i in range(0,len(arr)):
                hoursTaken = hoursTaken + (arr[i] + mid - 1) // mid
            if(hoursTaken<=k):
                ans = mid
                high = mid-1
            else:
                low = mid+1
        return ans
