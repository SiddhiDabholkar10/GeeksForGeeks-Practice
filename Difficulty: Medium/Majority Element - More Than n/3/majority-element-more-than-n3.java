class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        int cnt1=0, cnt2=0;
        ArrayList<Integer> majority = new ArrayList<>();
        int e1=Integer.MIN_VALUE;
        int e2=Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(cnt1==0 && e2!=arr[i]){
                cnt1++;
                e1=arr[i];
            }
            else if(cnt2==0 && e1!=arr[i]){
                cnt2++;
                e2=arr[i];
            }
            else if(e1==arr[i]){
                cnt1++;
            }
            else if(e2==arr[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=cnt2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==e1){
                cnt1++;
            }else if(arr[i]==e2){
                cnt2++;
            }
            
        }
        if(cnt1>n/3){
            majority.add(e1);
        }
        if(cnt2>n/3){
            majority.add(e2);
        }
        Collections.sort(majority);
        return majority;
        
        
    }
}