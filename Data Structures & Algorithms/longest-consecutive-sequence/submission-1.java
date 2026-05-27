class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int maxlen = 0;
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int len = 1;
                while (set.contains(num + 1)) {
                    len++;
                    num++;
                }
                maxlen = Math.max(len, maxlen);
            }
        }
        return maxlen;
    }
}
