class Solution {
    public String minWindow(String s, String t) {
        int freq[] = new int[128];
        int formed = 0;
        for (char ch : t.toCharArray()) {
            if (freq[ch] == 0)
                formed++;
            freq[ch]++;
        }
        int a[] = new int[128];
        int i = 0;
        int f = 0;
        int len = Integer.MAX_VALUE;
        int start = 0;
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            a[ch]++;
            if (a[ch] == freq[ch]) {
                f++;
            }
            while (f == formed) {
                if (j - i + 1 < len) {
                    len = j - i + 1;
                    start = i;
                }
                char c = s.charAt(i);
                a[c]--;
                if (a[c] < freq[c])
                    f--;
                i++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(start, start + len);
    }
}
