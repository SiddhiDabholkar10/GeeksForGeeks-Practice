class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n = arr.length;
        int max = arr[n-1];
       
        ArrayList<Integer> leaders = new ArrayList<>();
        leaders.add(max);
        for(int i=n-2;i>=0;i--){
            if(arr[i] >= max){
                leaders.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
