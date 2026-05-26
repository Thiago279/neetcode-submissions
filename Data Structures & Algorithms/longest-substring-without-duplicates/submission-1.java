class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window
        // brute force?
        //keep track of longest size 
        // use set to keep track of curr window
        if (s.length() == 0) return 0; 
        int left = 0;
        int right = 0;
        int longest = 0;

        HashSet<Character> set = new HashSet<>();
        while(right < s.length()){
            Character rightChar = s.charAt(right);
            while (set.contains(rightChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(rightChar);
            longest = Math.max(longest, right - left +1);
            right++;
        }
        return longest;
    }
}
