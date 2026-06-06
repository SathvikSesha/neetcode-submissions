class Solution {
    public int largestRectangleArea(int[] heights) {
        int ns[] = nextSmallest(heights);
        int ps[] = prevSmallest(heights);
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int width = ns[i] - ps[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
    public int[] nextSmallest(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            int ind = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
            res[i] = ind;
        }
        return res;
    }
    public int[] prevSmallest(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int res[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            int ind = st.isEmpty() ? -1 : st.peek();
            st.push(i);
            res[i] = ind;
        }
        return res;
    }
}
