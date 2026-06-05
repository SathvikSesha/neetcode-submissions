class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int res[] = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        for (int i = temp.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && temp[st.peek()] <= temp[i]) {
                st.pop();
            }
            int x = st.isEmpty() ? 0 : st.peek() - i;
            res[i] = x;
            st.push(i);
        }
        return res;
    }
}
