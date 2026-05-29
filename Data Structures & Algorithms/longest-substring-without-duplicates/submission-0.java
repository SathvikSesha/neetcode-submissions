class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int maxlen = 0;
        while(j<s.length()){
            char ch = s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;
            }
            j++;
            maxlen = Math.max(maxlen,j-i);
            set.add(ch);
        }
        return maxlen;
    }
}
