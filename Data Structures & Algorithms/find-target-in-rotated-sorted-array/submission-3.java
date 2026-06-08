class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int peak = p(nums);
        if (peak == -1)
            return bs(nums, target, start, end);
        if (nums[peak] == target)
            return peak;
        if (nums[start] <= target) {
            return bs(nums, target, start, peak - 1);
        }
        return bs(nums, target, peak + 1, end);
    }
    public int p(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    public int bs(int nums[], int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
