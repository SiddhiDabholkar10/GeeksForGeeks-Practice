class Solution {
    public ArrayList<ArrayList<Integer>> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
        ArrayList<ArrayList<Integer>> merged = new ArrayList<>();
        for(int[] interval: arr){
            if(merged.isEmpty() || interval[0] > merged.get(merged.size()-1).get(1)){
               ArrayList<Integer> mergedInterval = new ArrayList<>();
               mergedInterval.add(interval[0]);
               mergedInterval.add(interval[1]);
               merged.add(mergedInterval);
            }
            else{
                ArrayList<Integer> lastInterval = merged.get(merged.size()-1);
                lastInterval.set(1,Math.max(lastInterval.get(1),interval[1]));
            }
        }
        return merged;
    }
}