class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            char[] sChar= s.toCharArray();
            Arrays.sort(sChar);
            String sortedString = new String(sChar);
            map.putIfAbsent(sortedString, new ArrayList<>());
            map.get(sortedString).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
