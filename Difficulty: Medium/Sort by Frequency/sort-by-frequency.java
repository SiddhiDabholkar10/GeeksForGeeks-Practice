class Solution {
    public String frequencySort(String s) {
        // code here
        Map<Character,Integer> freq = new HashMap<>();
        for(char c: s.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        List<Character> chars = new ArrayList<>(freq.keySet());
        
        chars.sort((a, b) -> {
            if (!freq.get(a).equals(freq.get(b))) {
                return freq.get(a) - freq.get(b);
            }
            return a - b;
        });
        StringBuilder str = new StringBuilder();
        for(char c:chars){
            for(int i=0;i<freq.get(c);i++){
                str.append(c);
            }
        }
        return str.toString();
        
    }
};