class Solution {
    int maxLength(int arr[]) {
        // code here
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum =0;
        int n = arr.length;
        int maxLen = 0;
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum==0){
                maxLen = i+1;
            }
           
            if(preSumMap.containsKey(sum)){
                    int len = i-preSumMap.get(sum);
                     maxLen = Math.max(len,maxLen);
            }
               
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
        return maxLen;
    }
}