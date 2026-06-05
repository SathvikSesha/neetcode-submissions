class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> st = new Stack<>();
        int n = position.length;
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }
        Arrays.sort(arr, (a, b) -> (a[0] - b[0]));
        for (int i = n - 1; i >= 0; i--) {
            double time = (target - arr[i][0]) / (double) arr[i][1];
            if (!st.isEmpty()) {
                if (st.peek() < time)
                    st.push(time);
            } else {
                st.push(time);
            }
        }
        return st.size();
    }
}
