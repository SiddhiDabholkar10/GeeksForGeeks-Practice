class Solution {
    public int nthFibonacci(int n) {
        // code here
        if(n==0) return 0;
        if (n==1) return 1;
        int last = nthFibonacci(n-1);
        int slast = nthFibonacci(n-2);
        return slast + last;
        
    }
}