class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int arr[] = new int[2000];
        for (int num : nums) {
            arr[num + 1000]++;
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> {
            if (a[1] != b[1])
                return b[1] - a[1];
            return a[0] - b[0];
        });
        for (int i = 0; i < arr.length; i++) {
            q.offer(new int[] {i - 1000, arr[i]});
        }
        int res[] = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = q.poll()[0];
        }
        return res;
    }
}
