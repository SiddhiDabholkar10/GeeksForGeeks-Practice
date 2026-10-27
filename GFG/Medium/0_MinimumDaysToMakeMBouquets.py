"""
Problem Link : https://practice.geeksforgeeks.org/problems/minimum-days-to-make-m-bouquets/1
Platform     : GFG
Difficulty   : Medium
"""

class Solution:
    def canMakeBouquets(self, arr, day, k, m):
        consecutive = 0;
        bouquets = 0;
        for bloom in arr:
            if(bloom <= day):
                consecutive+=1
                if(consecutive == k):
                    bouquets+=1
                    consecutive = 0
            else:
                consecutive = 0
        return bouquets>=m
            
    
    def minDaysBloom(self, arr, k, m):
        # Code here
        n = len(arr)
        if(m*k > n):
            return -1
        answer = -1;
        low = min(arr)
        high = max(arr)
        while(low<=high):
            mid = (low+high)//2;
            if(self.canMakeBouquets(arr, mid, k, m)):
                answer = mid;
                high = mid-1;
            else:
                low = mid+1
        return answer
