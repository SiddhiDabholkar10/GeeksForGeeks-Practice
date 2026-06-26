class Solution {
    public int findUnique(int[] arr) {
        // code here
        int xor = 0;
        for(int i=0;i<arr.length;i++){
           xor^= arr[i];
        }
        return xor;
    }
}