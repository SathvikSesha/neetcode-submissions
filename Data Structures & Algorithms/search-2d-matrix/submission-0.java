class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] == target)
                return true;
            else if (matrix[i][0] > target) {
                if (i <= 0)
                    return false;
                int start = 0;
                int end = matrix[0].length - 1;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (matrix[i - 1][mid] == target)
                        return true;
                    if (matrix[i - 1][mid] < target)
                        start = mid + 1;
                    else
                        end = mid - 1;
                }
            }
        }
        int s = 0;
        int e = matrix[0].length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (matrix[matrix.length - 1][m] == target)
                return true;
            if (matrix[matrix.length - 1][m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return false;
    }
}
