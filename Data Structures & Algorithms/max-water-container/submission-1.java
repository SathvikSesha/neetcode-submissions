class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length - 1;
        int max = 0;
        while (i < j) {
            int len = j - i;
            int min = Math.min(heights[i], heights[j]);
            max = Math.max(min * len, max);
            if (heights[i] > heights[j])
                j--;
            else
                i++;
        }
        return max;
    }
}
