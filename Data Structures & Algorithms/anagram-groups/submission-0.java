class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // key - value = 
        //Alphabetically sorted word 
        //(all anagrams share the same) - list of anagrams
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++){
            //convert string to array in order to sort
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            //if new anagram, create list, else just add
            if (!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(map.values());

    }
}
