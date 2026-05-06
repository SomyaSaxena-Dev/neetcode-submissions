class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupedAGs = new ArrayList<>();
        if(strs.length <= 1) {
                groupedAGs.add( Arrays.asList(strs));
                return groupedAGs;
        }
        HashMap<String, List<String>> anagramMap = new HashMap();
        for(String str : strs) {
            String key = getSortedString(str);
            List<String> anagrams = anagramMap.getOrDefault(key, new ArrayList<>());
            anagrams.add(str);
            anagramMap.put(key, anagrams);
            
        }
        return new ArrayList<>(anagramMap.values());
    }

    private String getSortedString(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);

    }
}
