class Solution {
    int majorityElement(int arr[]) {
        // code here
        int n = arr.length;
        int count = 0;
        int maxEle = -1;
        for(int i=0;i<n;i++){
            if(maxEle == arr[i]){
                count++;
            }
            else if(count == 0){ //newmaxEle
                count++;
                maxEle = arr[i];
            }
            
            else{
                count--;
            }
            
        }
        //verify maxEle
        int cnt_maxEle = 0;
        for(int i =0;i<n;i++){
            if(arr[i]==maxEle){
                cnt_maxEle ++;
            }
        }
        if(cnt_maxEle > n/2){
            return maxEle;
        }
        return -1;
        
    }
}