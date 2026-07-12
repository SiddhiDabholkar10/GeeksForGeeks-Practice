class Solution {
    ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;

        long Sn = (long) n * (n + 1) / 2;
        long S2n = (long) n * (n + 1) * (2L * n + 1) / 6;

        long S = 0;
        long S2 = 0;

        for (int a : arr) {
            S += a;
            S2 += (long) a * a;
        }

        long val1 = S - Sn;       // repeating - missing
        long val2 = S2 - S2n;     // repeating² - missing²

        val2 = val2 / val1;       // repeating + missing

        long repeating = (val1 + val2) / 2;
        long missing = repeating - val1;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int) repeating);
        ans.add((int) missing);

        return ans;
    }
}