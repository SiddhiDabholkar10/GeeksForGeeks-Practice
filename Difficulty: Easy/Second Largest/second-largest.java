//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        if(arr.length == 1  || arr.length==0){
            return -1;
        }
        int largest ;
        int sec_largest ;
        if(arr[0]> arr[1]){
            largest = arr[0];
            sec_largest = arr[1];
        }
        else{
            largest = arr[1];
            sec_largest = arr[0];
        }
        if(arr.length == 2){
            return sec_largest;
        }
        for(int i=2;i<arr.length;i++){
                        if (arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            } else if (arr[i] > sec_largest && arr[i] < largest) {
                sec_largest = arr[i];
            }

           
        }
        if(largest == sec_largest){
            return -1;
        }
        return sec_largest;
    }
}