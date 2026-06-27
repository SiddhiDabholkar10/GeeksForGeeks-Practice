class Solution {
    void reverse(int[] arr,int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    void nextPermutation(int[] arr) {
        // code here
        int dip_index = -1;
        int n = arr.length;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                dip_index = i;
                break;
            }
        }
        if(dip_index!=-1){
            for(int i=n-1;i>dip_index;i--){
                if(arr[i]>arr[dip_index]){
                    int temp = arr[i];
                    arr[i] = arr[dip_index];
                    arr[dip_index] = temp;
                    break;
                }
            }
        }
        reverse(arr,dip_index+1,n-1);
    }
}