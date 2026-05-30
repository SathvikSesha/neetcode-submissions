class Solution {
    public int characterReplacement(String s, int k) {
        int arr[] = new int[26];
        int maxFreq = 0;
        int maxLen = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            arr[ch - 'A']++;

            maxFreq = Math.max(maxFreq, arr[ch - 'A']);

            while ((j - i + 1) - maxFreq > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }
}
