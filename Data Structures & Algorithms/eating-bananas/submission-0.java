class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 0;
        int end = Arrays.stream(piles).max().getAsInt();
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (check(piles, h, mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    public boolean check(int arr[], int h, int mid) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count > h)
                return false;
            if (arr[i] > mid) {
                int num = (int) Math.ceil(arr[i] / (double) mid);
                count += num;
            } else {
                count++;
            }
        }
        return count <= h;
    }
}
