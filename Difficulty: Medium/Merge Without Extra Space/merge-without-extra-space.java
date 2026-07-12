class Solution {
    public void swapIfGreater(int a[],int b[],int i,int j){
        if(a[i]>b[j]){
            int temp = a[i];
            a[i] = b[j];
            b[j] = temp;
            
        }
    }
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int len = (m+n);
        int gap = (len/2 + len%2);
        while (gap>0){
            int left = 0;
            int right = left+gap;
            while(right< len){
                if(left<n && right>=n){
                    swapIfGreater(a,b,left,right-n);
                    
                }else if(left>=n){
                    swapIfGreater(b,b,left-n,right-n);
                }else{
                    swapIfGreater(a,a,left,right);
                }
                left++;
                right++;
            }
           if(gap == 1) break;
           gap = gap/2 + gap%2;
        }
    }
}
