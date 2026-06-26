class Solution {
    int missingNum(int arr[]) {
        // code here
        int n = arr.length;
        int xor_math=0;
        int xor_array=0;
        for(int i=1;i<=n+1;i++){
            xor_math ^= i;
        }
        for(int i=0;i<n;i++){
            xor_array ^= arr[i];
        }
        return xor_math^xor_array;
    }
}