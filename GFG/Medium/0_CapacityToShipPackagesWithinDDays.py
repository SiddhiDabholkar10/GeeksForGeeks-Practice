"""
Problem Link : https://practice.geeksforgeeks.org/problems/capacity-to-ship-packages-within-d-days/1
Platform     : GFG
Difficulty   : Medium
"""

class Solution:
    def countDays(self,arr,capacity):
        days = 1
        load = 0
        for weight in arr:
            if(weight + load > capacity):
                days+=1
                load = weight
            else:
                load += weight
        return days
    def leastWeightCapacity(self, arr, d):
        # code here
        low = max(arr)
        high = sum(arr)
        answer = -1
        while(low<=high):
            mid = (low+high)//2
            daysRequired = self.countDays(arr, mid)
            if(daysRequired<=d):
                answer = mid
                high = mid-1
            else:
                low = mid+1
                
        return answer
                
                
        
