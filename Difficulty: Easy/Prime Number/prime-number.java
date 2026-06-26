class Solution {
    static boolean isPrime(int n) {
        // code here
        if(n==1){
            return false;
        }
        int sqrt_N = (int) Math.sqrt(n);
        for(int i=2;i<=sqrt_N;i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
        
    }
}