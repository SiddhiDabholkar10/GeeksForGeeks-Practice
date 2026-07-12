class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        long Sn = (long) n*(n+1)/2;
        long S2n = (long) n*(n+1)*(2L*n+1)/6;
        long S = 0;
        long S2 = 0;
        for(int a : arr){
            S += a;
            S2 += (long) a*a;
        }
        long val1 = S - Sn;  //(x-y)
        long val2 = S2 - S2n;   //(x2 - y2)
        val2 = val2/val1; //(x+y)
        //2x = val1+val2 -> x = (val1+val2)/2
        long x = (val1 + val2) / 2;
        long y = x - val1;
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) x);
        ans.add((int) y);
        
        return ans;
        
        
    }
}
