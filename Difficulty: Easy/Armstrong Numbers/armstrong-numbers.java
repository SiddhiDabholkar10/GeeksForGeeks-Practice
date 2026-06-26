class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int temp = n;
        while(temp!=0){
            int rem = temp%10;
            sum += Math.pow(rem,3);
            temp /= 10;
        }
        if(sum == n){
            return true;
        }
        return false;
        
    }
}