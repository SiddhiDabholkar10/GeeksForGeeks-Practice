class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        long count = 0;
        int XOR = 0;

        Map<Integer,Integer> xorMap = new HashMap<>();
        xorMap.put(0, 1);
        for(int num:arr){
            XOR = XOR ^ num;
            int prefix = XOR ^ k;
            
            if(xorMap.containsKey(prefix)){
                count += xorMap.get(prefix);
            }
            xorMap.put(XOR, xorMap.getOrDefault(XOR,0)+1);
            
        }
        return count;
    }
}
