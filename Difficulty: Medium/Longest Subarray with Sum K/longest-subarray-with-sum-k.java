class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> preSumMap = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == k){
                maxLen = Math.max(maxLen,i+1);
            }
            int rem = sum - k;
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen,len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
            
        }
        return maxLen;
    }
}
