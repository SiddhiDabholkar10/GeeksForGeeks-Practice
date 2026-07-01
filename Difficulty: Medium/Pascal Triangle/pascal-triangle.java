class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> nthRow = new ArrayList<>();
        int ans = 1;
        nthRow.add(ans);
        for(int i=1;i<n;i++){
            ans = ans * (n-i);
            ans = ans/i;
            nthRow.add(ans);
        }
        return nthRow;
    }
}