class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        long count = 0;
        int XOR = 0;

        Map<Integer,Integer> xorMap = new HashMap<>();
        xorMap.put(0, 1);
        for(int i=0;i<arr.length;i++){
            XOR = XOR ^ arr[i];
            int x = XOR ^ k;
            if(xorMap.containsKey(x)){
                count += xorMap.get(x);
            }
            xorMap.put(XOR, xorMap.getOrDefault(XOR,0)+1);
            
        }
        return count;
    }
}